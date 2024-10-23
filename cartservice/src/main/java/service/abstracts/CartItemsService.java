package service.abstracts;

import dto.cartitems.*;

import java.util.List;
import java.util.UUID;

public interface CartItemsService {
    List<GetAllCartItemResponse> getAll();
    GetByIdCartItemResponse getById(UUID id);
    CreateCartItemResponse create(CreateCartItemRequest request);
    UpdateCartItemResponse update(UpdateCartItemRequest request);
    DeleteCartItemResponse delete(UUID id);
}
