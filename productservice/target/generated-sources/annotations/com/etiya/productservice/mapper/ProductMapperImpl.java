package com.etiya.productservice.mapper;

import com.etiya.productservice.dto.product.CreateProductRequest;
import com.etiya.productservice.dto.product.CreateProductResponse;
import com.etiya.productservice.dto.product.DeleteProductResponse;
import com.etiya.productservice.dto.product.GetAllProductResponse;
import com.etiya.productservice.dto.product.GetByIdProductResponse;
import com.etiya.productservice.dto.product.UpdateProductRequest;
import com.etiya.productservice.dto.product.UpdateProductResponse;
import com.etiya.productservice.entity.Category;
import com.etiya.productservice.entity.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-23T12:35:27+0300",
    comments = "version: 1.6.0, compiler: javac, environment: Java 23 (Oracle Corporation)"
)
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Product productFromCreateRequest(CreateProductRequest dto) {
        if ( dto == null ) {
            return null;
        }

        Product product = new Product();

        product.setCategory( createProductRequestToCategory( dto ) );
        product.setName( dto.getName() );
        product.setUnitPrice( dto.getUnitPrice() );
        product.setQuantity( dto.getQuantity() );

        return product;
    }

    @Override
    public CreateProductResponse productFromCreateResponse(Product product) {
        if ( product == null ) {
            return null;
        }

        CreateProductResponse createProductResponse = new CreateProductResponse();

        createProductResponse.setCategoryId( productCategoryId( product ) );
        createProductResponse.setId( product.getId() );
        createProductResponse.setName( product.getName() );
        createProductResponse.setUnitPrice( product.getUnitPrice() );
        createProductResponse.setQuantity( product.getQuantity() );

        return createProductResponse;
    }

    @Override
    public Product productFromUpdateRequest(UpdateProductRequest request) {
        if ( request == null ) {
            return null;
        }

        Product product = new Product();

        product.setCategory( updateProductRequestToCategory( request ) );
        product.setId( request.getId() );
        product.setName( request.getName() );
        product.setUnitPrice( request.getUnitPrice() );
        product.setQuantity( request.getQuantity() );

        return product;
    }

    @Override
    public UpdateProductResponse productFromUpdateResponse(Product product) {
        if ( product == null ) {
            return null;
        }

        UpdateProductResponse updateProductResponse = new UpdateProductResponse();

        updateProductResponse.setCategoryId( productCategoryId( product ) );
        updateProductResponse.setId( product.getId() );
        updateProductResponse.setName( product.getName() );
        updateProductResponse.setUnitPrice( product.getUnitPrice() );
        updateProductResponse.setQuantity( product.getQuantity() );

        return updateProductResponse;
    }

    @Override
    public List<GetAllProductResponse> productFromGetAllResponse(List<Product> products) {
        if ( products == null ) {
            return null;
        }

        List<GetAllProductResponse> list = new ArrayList<GetAllProductResponse>( products.size() );
        for ( Product product : products ) {
            list.add( productToGetAllProductResponse( product ) );
        }

        return list;
    }

    @Override
    public GetByIdProductResponse productFromGetByIdResponse(Product product) {
        if ( product == null ) {
            return null;
        }

        GetByIdProductResponse getByIdProductResponse = new GetByIdProductResponse();

        getByIdProductResponse.setCategoryId( productCategoryId( product ) );
        getByIdProductResponse.setId( product.getId() );
        getByIdProductResponse.setName( product.getName() );
        getByIdProductResponse.setUnitPrice( product.getUnitPrice() );
        getByIdProductResponse.setQuantity( product.getQuantity() );

        return getByIdProductResponse;
    }

    @Override
    public DeleteProductResponse productFromDeleteResponse(Product product) {
        if ( product == null ) {
            return null;
        }

        DeleteProductResponse deleteProductResponse = new DeleteProductResponse();

        deleteProductResponse.setId( product.getId() );
        deleteProductResponse.setName( product.getName() );

        return deleteProductResponse;
    }

    protected Category createProductRequestToCategory(CreateProductRequest createProductRequest) {
        if ( createProductRequest == null ) {
            return null;
        }

        Category category = new Category();

        category.setId( createProductRequest.getCategoryId() );

        return category;
    }

    private UUID productCategoryId(Product product) {
        Category category = product.getCategory();
        if ( category == null ) {
            return null;
        }
        return category.getId();
    }

    protected Category updateProductRequestToCategory(UpdateProductRequest updateProductRequest) {
        if ( updateProductRequest == null ) {
            return null;
        }

        Category category = new Category();

        category.setId( updateProductRequest.getCategoryId() );

        return category;
    }

    protected GetAllProductResponse productToGetAllProductResponse(Product product) {
        if ( product == null ) {
            return null;
        }

        GetAllProductResponse getAllProductResponse = new GetAllProductResponse();

        getAllProductResponse.setId( product.getId() );
        getAllProductResponse.setName( product.getName() );
        getAllProductResponse.setUnitPrice( product.getUnitPrice() );
        getAllProductResponse.setQuantity( product.getQuantity() );

        return getAllProductResponse;
    }
}
