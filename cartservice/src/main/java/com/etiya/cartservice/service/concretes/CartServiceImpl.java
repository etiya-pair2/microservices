package com.etiya.cartservice.service.concretes;

import com.etiya.cartservice.dto.cart.*;
import com.etiya.cartservice.mapper.CartMapper;
import com.etiya.cartservice.entity.Cart;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.etiya.cartservice.repository.CartRepository;
import com.etiya.cartservice.service.abstracts.CartService;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CartService {
    @Autowired
    private final CartRepository cartRepository;

    @Override
    public List<GetAllCartResponse> getAll() {
        List<Cart> carts = cartRepository.findAll();
        return CartMapper.INSTANCE.cartFromGetAllResponse(carts);
    }

    @Override
    public GetByIdCartResponse getById(UUID id) {
        Cart cart = cartRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cart not found"));
        return CartMapper.INSTANCE.cartFromGetByIdResponse(cart);
    }

    @Override
    public CreateCartResponse create(CreateCartRequest request) {
        Cart cart = CartMapper.INSTANCE.cartFromCreateRequest(request);
        cartRepository.save(cart);
        return CartMapper.INSTANCE.cartFromCreateResponse(cart);
    }

    @Override
    public UpdateCartResponse update(UpdateCartRequest request) {
        Cart cart = CartMapper.INSTANCE.cartFromUpdateRequest(request);
        cartRepository.save(cart);
        return CartMapper.INSTANCE.cartFromUpdateResponse(cart);
    }

    @Override
    public DeleteCartResponse delete(UUID id) {
        Cart cart = cartRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cart not found"));
        cartRepository.delete(cart);
        return CartMapper.INSTANCE.cartFromDeleteResponse(cart);
    }
}