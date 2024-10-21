package com.etiya.productservice.controller;

import com.etiya.productservice.entity.Product;
import com.etiya.productservice.service.abstracts.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
//    @PostMapping
//    public ResponseEntity<String> add(@RequestBody Product product) {
//        productService.add(product);
//        return ResponseEntity.ok("Eklendi");
//    }

    @PostMapping("search")
    public List<Product> getByIds(@RequestBody List<UUID> ids)
    {
        return productService.search(ids);
    }
}