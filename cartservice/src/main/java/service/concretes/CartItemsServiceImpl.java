package service.concretes;

import mapper.CartItemsMapper;
import dto.cartitems.*;
import entity.CartItems;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import repository.CartItemsRepository;
import service.abstracts.CartItemsService;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CartItemsServiceImpl implements CartItemsService {
    private final CartItemsRepository cartItemsRepository;

    @Override
    public List<GetAllCartItemResponse> getAll() {
        List<CartItems> cartItems = cartItemsRepository.findAll();
        return CartItemsMapper.INSTANCE.cartItemsFromGetAllResponse(cartItems);
    }

    @Override
    public GetByIdCartItemResponse getById(UUID id) {
        CartItems cartItem = cartItemsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cart Item not found"));
        return CartItemsMapper.INSTANCE.cartItemsFromGetByIdResponse(cartItem);
    }

    @Override
    public CreateCartItemResponse create(CreateCartItemRequest request) {
        CartItems cartItem = CartItemsMapper.INSTANCE.cartItemsFromCreateRequest(request);
        cartItemsRepository.save(cartItem);
        return CartItemsMapper.INSTANCE.cartItemsFromCreateResponse(cartItem);
    }

    @Override
    public UpdateCartItemResponse update(UpdateCartItemRequest request) {
        CartItems cartItem = CartItemsMapper.INSTANCE.cartItemsFromUpdateRequest(request);
        cartItemsRepository.save(cartItem);
        return CartItemsMapper.INSTANCE.cartItemsFromUpdateResponse(cartItem);
    }

    @Override
    public DeleteCartItemResponse delete(UUID id) {
        CartItems cartItem = cartItemsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cart Item not found"));
        cartItemsRepository.delete(cartItem);
        return CartItemsMapper.INSTANCE.cartItemsFromDeleteResponse(cartItem);
    }
}