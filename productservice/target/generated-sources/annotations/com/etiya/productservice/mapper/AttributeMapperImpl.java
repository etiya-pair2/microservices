package com.etiya.productservice.mapper;

import com.etiya.productservice.dto.attribute.CreateAttributeRequest;
import com.etiya.productservice.dto.attribute.CreateAttributeResponse;
import com.etiya.productservice.dto.attribute.DeleteAttributeResponse;
import com.etiya.productservice.dto.attribute.GetAllAttributeResponse;
import com.etiya.productservice.dto.attribute.GetByIdAttributeResponse;
import com.etiya.productservice.dto.attribute.UpdateAttributeRequest;
import com.etiya.productservice.dto.attribute.UpdateAttributeResponse;
import com.etiya.productservice.entity.Attribute;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-23T12:35:27+0300",
    comments = "version: 1.6.0, compiler: javac, environment: Java 23 (Oracle Corporation)"
)
public class AttributeMapperImpl implements AttributeMapper {

    @Override
    public Attribute attributeFromCreateRequest(CreateAttributeRequest dto) {
        if ( dto == null ) {
            return null;
        }

        Attribute attribute = new Attribute();

        attribute.setName( dto.getName() );

        return attribute;
    }

    @Override
    public CreateAttributeResponse attributeFromCreateResponse(Attribute attribute) {
        if ( attribute == null ) {
            return null;
        }

        CreateAttributeResponse createAttributeResponse = new CreateAttributeResponse();

        createAttributeResponse.setId( attribute.getId() );
        createAttributeResponse.setName( attribute.getName() );

        return createAttributeResponse;
    }

    @Override
    public Attribute attributeFromUpdateRequest(UpdateAttributeRequest request) {
        if ( request == null ) {
            return null;
        }

        Attribute attribute = new Attribute();

        attribute.setId( request.getId() );
        attribute.setName( request.getName() );

        return attribute;
    }

    @Override
    public UpdateAttributeResponse attributeFromUpdateResponse(Attribute attribute) {
        if ( attribute == null ) {
            return null;
        }

        UpdateAttributeResponse updateAttributeResponse = new UpdateAttributeResponse();

        updateAttributeResponse.setId( attribute.getId() );
        updateAttributeResponse.setName( attribute.getName() );

        return updateAttributeResponse;
    }

    @Override
    public List<GetAllAttributeResponse> attributeFromGetAllResponse(List<Attribute> attributes) {
        if ( attributes == null ) {
            return null;
        }

        List<GetAllAttributeResponse> list = new ArrayList<GetAllAttributeResponse>( attributes.size() );
        for ( Attribute attribute : attributes ) {
            list.add( attributeToGetAllAttributeResponse( attribute ) );
        }

        return list;
    }

    @Override
    public GetByIdAttributeResponse attributeFromGetByIdResponse(Attribute attribute) {
        if ( attribute == null ) {
            return null;
        }

        GetByIdAttributeResponse getByIdAttributeResponse = new GetByIdAttributeResponse();

        getByIdAttributeResponse.setName( attribute.getName() );

        return getByIdAttributeResponse;
    }

    @Override
    public DeleteAttributeResponse attributeFromDeleteResponse(Attribute attribute) {
        if ( attribute == null ) {
            return null;
        }

        DeleteAttributeResponse deleteAttributeResponse = new DeleteAttributeResponse();

        deleteAttributeResponse.setId( attribute.getId() );
        deleteAttributeResponse.setName( attribute.getName() );

        return deleteAttributeResponse;
    }

    protected GetAllAttributeResponse attributeToGetAllAttributeResponse(Attribute attribute) {
        if ( attribute == null ) {
            return null;
        }

        GetAllAttributeResponse getAllAttributeResponse = new GetAllAttributeResponse();

        getAllAttributeResponse.setId( attribute.getId() );
        getAllAttributeResponse.setName( attribute.getName() );

        return getAllAttributeResponse;
    }
}
