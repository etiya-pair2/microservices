package com.etiya.productservice.mapper;

import com.etiya.productservice.dto.productAttribute.CreateProductAttributeRequest;
import com.etiya.productservice.dto.productAttribute.CreateProductAttributeResponse;
import com.etiya.productservice.dto.productAttribute.DeleteProductAttributeResponse;
import com.etiya.productservice.dto.productAttribute.GetAllProductAttributeResponse;
import com.etiya.productservice.dto.productAttribute.GetByIdProductAttributeResponse;
import com.etiya.productservice.dto.productAttribute.UpdateProductAttributeRequest;
import com.etiya.productservice.dto.productAttribute.UpdateProductAttributeResponse;
import com.etiya.productservice.entity.Attribute;
import com.etiya.productservice.entity.Product;
import com.etiya.productservice.entity.ProductAttribute;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-23T12:35:28+0300",
    comments = "version: 1.6.0, compiler: javac, environment: Java 23 (Oracle Corporation)"
)
public class ProductAttributeMapperImpl implements ProductAttributeMapper {

    @Override
    public ProductAttribute productAttributeFromCreateRequest(CreateProductAttributeRequest request) {
        if ( request == null ) {
            return null;
        }

        ProductAttribute productAttribute = new ProductAttribute();

        productAttribute.setProduct( createProductAttributeRequestToProduct( request ) );
        productAttribute.setAttribute( createProductAttributeRequestToAttribute( request ) );
        productAttribute.setValue( request.getValue() );

        return productAttribute;
    }

    @Override
    public CreateProductAttributeResponse productAttributeFromCreateResponse(ProductAttribute productAttribute) {
        if ( productAttribute == null ) {
            return null;
        }

        CreateProductAttributeResponse createProductAttributeResponse = new CreateProductAttributeResponse();

        createProductAttributeResponse.setProductId( productAttributeProductId( productAttribute ) );
        createProductAttributeResponse.setAttributeId( productAttributeAttributeId( productAttribute ) );
        createProductAttributeResponse.setId( productAttribute.getId() );
        createProductAttributeResponse.setValue( productAttribute.getValue() );

        return createProductAttributeResponse;
    }

    @Override
    public ProductAttribute productAttributeFromUpdateRequest(UpdateProductAttributeRequest request) {
        if ( request == null ) {
            return null;
        }

        ProductAttribute productAttribute = new ProductAttribute();

        productAttribute.setProduct( updateProductAttributeRequestToProduct( request ) );
        productAttribute.setAttribute( updateProductAttributeRequestToAttribute( request ) );
        productAttribute.setId( request.getId() );
        productAttribute.setValue( request.getValue() );

        return productAttribute;
    }

    @Override
    public UpdateProductAttributeResponse productAttributeFromUpdateResponse(ProductAttribute productAttribute) {
        if ( productAttribute == null ) {
            return null;
        }

        UpdateProductAttributeResponse updateProductAttributeResponse = new UpdateProductAttributeResponse();

        updateProductAttributeResponse.setProductId( productAttributeProductId( productAttribute ) );
        updateProductAttributeResponse.setAttributeId( productAttributeAttributeId( productAttribute ) );
        updateProductAttributeResponse.setId( productAttribute.getId() );
        updateProductAttributeResponse.setValue( productAttribute.getValue() );

        return updateProductAttributeResponse;
    }

    @Override
    public List<GetAllProductAttributeResponse> productAttributeFromGetAllResponse(List<ProductAttribute> productAttributes) {
        if ( productAttributes == null ) {
            return null;
        }

        List<GetAllProductAttributeResponse> list = new ArrayList<GetAllProductAttributeResponse>( productAttributes.size() );
        for ( ProductAttribute productAttribute : productAttributes ) {
            list.add( productAttributeToGetAllProductAttributeResponse( productAttribute ) );
        }

        return list;
    }

    @Override
    public GetByIdProductAttributeResponse productAttributeFromGetByIdResponse(ProductAttribute productAttribute) {
        if ( productAttribute == null ) {
            return null;
        }

        GetByIdProductAttributeResponse getByIdProductAttributeResponse = new GetByIdProductAttributeResponse();

        getByIdProductAttributeResponse.setProductId( productAttributeProductId( productAttribute ) );
        getByIdProductAttributeResponse.setAttributeId( productAttributeAttributeId( productAttribute ) );
        getByIdProductAttributeResponse.setId( productAttribute.getId() );
        getByIdProductAttributeResponse.setValue( productAttribute.getValue() );

        return getByIdProductAttributeResponse;
    }

    @Override
    public DeleteProductAttributeResponse productAttributeFromDeleteResponse(ProductAttribute productAttribute) {
        if ( productAttribute == null ) {
            return null;
        }

        DeleteProductAttributeResponse deleteProductAttributeResponse = new DeleteProductAttributeResponse();

        deleteProductAttributeResponse.setId( productAttribute.getId() );
        deleteProductAttributeResponse.setValue( productAttribute.getValue() );

        return deleteProductAttributeResponse;
    }

    protected Product createProductAttributeRequestToProduct(CreateProductAttributeRequest createProductAttributeRequest) {
        if ( createProductAttributeRequest == null ) {
            return null;
        }

        Product product = new Product();

        product.setId( createProductAttributeRequest.getProductId() );

        return product;
    }

    protected Attribute createProductAttributeRequestToAttribute(CreateProductAttributeRequest createProductAttributeRequest) {
        if ( createProductAttributeRequest == null ) {
            return null;
        }

        Attribute attribute = new Attribute();

        attribute.setId( createProductAttributeRequest.getAttributeId() );

        return attribute;
    }

    private UUID productAttributeProductId(ProductAttribute productAttribute) {
        Product product = productAttribute.getProduct();
        if ( product == null ) {
            return null;
        }
        return product.getId();
    }

    private UUID productAttributeAttributeId(ProductAttribute productAttribute) {
        Attribute attribute = productAttribute.getAttribute();
        if ( attribute == null ) {
            return null;
        }
        return attribute.getId();
    }

    protected Product updateProductAttributeRequestToProduct(UpdateProductAttributeRequest updateProductAttributeRequest) {
        if ( updateProductAttributeRequest == null ) {
            return null;
        }

        Product product = new Product();

        product.setId( updateProductAttributeRequest.getProductId() );

        return product;
    }

    protected Attribute updateProductAttributeRequestToAttribute(UpdateProductAttributeRequest updateProductAttributeRequest) {
        if ( updateProductAttributeRequest == null ) {
            return null;
        }

        Attribute attribute = new Attribute();

        attribute.setId( updateProductAttributeRequest.getAttributeId() );

        return attribute;
    }

    protected GetAllProductAttributeResponse productAttributeToGetAllProductAttributeResponse(ProductAttribute productAttribute) {
        if ( productAttribute == null ) {
            return null;
        }

        GetAllProductAttributeResponse getAllProductAttributeResponse = new GetAllProductAttributeResponse();

        getAllProductAttributeResponse.setId( productAttribute.getId() );
        getAllProductAttributeResponse.setValue( productAttribute.getValue() );

        return getAllProductAttributeResponse;
    }
}
