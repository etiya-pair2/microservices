package com.etiya.productservice.mapper;

import com.etiya.productservice.dto.category.CreateCategoryRequest;
import com.etiya.productservice.dto.category.CreateCategoryResponse;
import com.etiya.productservice.dto.category.DeleteCategoryResponse;
import com.etiya.productservice.dto.category.GetAllCategoryResponse;
import com.etiya.productservice.dto.category.GetByIdCategoryResponse;
import com.etiya.productservice.dto.category.UpdateCategoryRequest;
import com.etiya.productservice.dto.category.UpdateCategoryResponse;
import com.etiya.productservice.entity.Category;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-23T12:35:28+0300",
    comments = "version: 1.6.0, compiler: javac, environment: Java 23 (Oracle Corporation)"
)
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public Category categoryFromCreateRequest(CreateCategoryRequest dto) {
        if ( dto == null ) {
            return null;
        }

        Category category = new Category();

        category.setName( dto.getName() );

        return category;
    }

    @Override
    public CreateCategoryResponse categoryFromCreateResponse(Category category) {
        if ( category == null ) {
            return null;
        }

        CreateCategoryResponse createCategoryResponse = new CreateCategoryResponse();

        createCategoryResponse.setId( category.getId() );
        createCategoryResponse.setName( category.getName() );

        return createCategoryResponse;
    }

    @Override
    public Category categoryFromUpdateRequest(UpdateCategoryRequest request) {
        if ( request == null ) {
            return null;
        }

        Category category = new Category();

        category.setId( request.getId() );
        category.setName( request.getName() );

        return category;
    }

    @Override
    public UpdateCategoryResponse categoryFromUpdateResponse(Category category) {
        if ( category == null ) {
            return null;
        }

        UpdateCategoryResponse updateCategoryResponse = new UpdateCategoryResponse();

        updateCategoryResponse.setId( category.getId() );
        updateCategoryResponse.setName( category.getName() );

        return updateCategoryResponse;
    }

    @Override
    public List<GetAllCategoryResponse> categoryFromGetAllResponse(List<Category> categories) {
        if ( categories == null ) {
            return null;
        }

        List<GetAllCategoryResponse> list = new ArrayList<GetAllCategoryResponse>( categories.size() );
        for ( Category category : categories ) {
            list.add( categoryToGetAllCategoryResponse( category ) );
        }

        return list;
    }

    @Override
    public GetByIdCategoryResponse categoryFromGetByIdResponse(Category category) {
        if ( category == null ) {
            return null;
        }

        GetByIdCategoryResponse getByIdCategoryResponse = new GetByIdCategoryResponse();

        getByIdCategoryResponse.setName( category.getName() );

        return getByIdCategoryResponse;
    }

    @Override
    public DeleteCategoryResponse categoryFromDeleteResponse(Category category) {
        if ( category == null ) {
            return null;
        }

        DeleteCategoryResponse deleteCategoryResponse = new DeleteCategoryResponse();

        deleteCategoryResponse.setId( category.getId() );
        deleteCategoryResponse.setName( category.getName() );

        return deleteCategoryResponse;
    }

    protected GetAllCategoryResponse categoryToGetAllCategoryResponse(Category category) {
        if ( category == null ) {
            return null;
        }

        GetAllCategoryResponse getAllCategoryResponse = new GetAllCategoryResponse();

        getAllCategoryResponse.setId( category.getId() );
        getAllCategoryResponse.setName( category.getName() );

        return getAllCategoryResponse;
    }
}
