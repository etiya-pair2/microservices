package com.etiya.productservice.controller;

import com.etiya.productservice.dto.category.CreateCategoryRequest;
import com.etiya.productservice.dto.category.CreateCategoryResponse;
import com.etiya.productservice.service.abstracts.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping("/create")
    public ResponseEntity<CreateCategoryResponse> create(@RequestBody CreateCategoryRequest request){
        return ResponseEntity.ok(categoryService.create(request));
    }

}
