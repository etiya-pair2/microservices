package controller;
import dto.cart.*;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.abstracts.CartService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/carts")
@RequiredArgsConstructor
public class CartController {

    private final CartService cartService;

    @GetMapping("/getAll")
    public List<GetAllCartResponse> getAll() {
        return cartService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<GetByIdCartResponse> getById(@PathVariable UUID id) {
        GetByIdCartResponse response = cartService.getById(id);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/create")
    public ResponseEntity<CreateCartResponse> create(@RequestBody @Valid CreateCartRequest request) {
        CreateCartResponse response = cartService.create(request);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<UpdateCartResponse> update(@RequestBody @Valid UpdateCartRequest request) {
        UpdateCartResponse response = cartService.update(request);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<DeleteCartResponse> delete(@PathVariable UUID id) {
        DeleteCartResponse response = cartService.delete(id);
        return ResponseEntity.ok(response);
    }
}