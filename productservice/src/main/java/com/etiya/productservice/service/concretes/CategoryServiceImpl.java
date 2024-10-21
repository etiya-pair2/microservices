package com.etiya.productservice.service.concretes;

import com.etiya.productservice.dto.category.*;
import com.etiya.productservice.entity.Category;
import com.etiya.productservice.mapper.CategoryMapper;
import com.etiya.productservice.repository.CategoryRepository;
import com.etiya.productservice.service.abstracts.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService{

    private final CategoryRepository categoryRepository;

    CategoryMapper categoryMapper = CategoryMapper.INSTANCE;
    @Override
    public List<GetAllCategoryResponse> getAll() {
        List<Category> categories = categoryRepository.findAll();
        return categoryMapper.categoryFromGetAllResponse(categories);
    }

    @Override
    public CreateCategoryResponse create(CreateCategoryRequest request) {
        Category category = categoryRepository.save(categoryMapper.categoryFromCreateRequest(request));
        return categoryMapper.categoryFromCreateResponse(category);
    }

    @Override
    public UpdateCategoryResponse update(UpdateCategoryRequest request) {
        Category category = categoryRepository.save(categoryMapper.categoryFromUpdateRequest(request));
        return categoryMapper.categoryFromUpdateResponse(category);
    }

    @Override
    public DeleteCategoryResponse delete(UUID id) {
        categoryRepository.deleteById(id);
        return categoryMapper.categoryFromDeleteResponse(categoryRepository.findById(id).orElseThrow());
    }

}
