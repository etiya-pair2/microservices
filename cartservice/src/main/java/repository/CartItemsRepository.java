package repository;

import entity.CartItems;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CartItemsRepository extends JpaRepository<CartItems, UUID> {
}
