package com.etiya.productservice.mapper;

import com.etiya.productservice.dto.campaignProduct.CreateCampaignProductRequest;
import com.etiya.productservice.dto.campaignProduct.CreateCampaignProductResponse;
import com.etiya.productservice.dto.campaignProduct.DeleteCampaignProductResponse;
import com.etiya.productservice.dto.campaignProduct.GetAllCampaignProductResponse;
import com.etiya.productservice.dto.campaignProduct.GetByIdCampaignProductResponse;
import com.etiya.productservice.dto.campaignProduct.UpdateCampaignProductRequest;
import com.etiya.productservice.dto.campaignProduct.UpdateCampaignProductResponse;
import com.etiya.productservice.entity.Campaign;
import com.etiya.productservice.entity.CampaignProduct;
import com.etiya.productservice.entity.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-23T12:35:28+0300",
    comments = "version: 1.6.0, compiler: javac, environment: Java 23 (Oracle Corporation)"
)
public class CampaignProductMapperImpl implements CampaignProductMapper {

    @Override
    public CampaignProduct campaignProductFromCreateRequest(CreateCampaignProductRequest request) {
        if ( request == null ) {
            return null;
        }

        CampaignProduct campaignProduct = new CampaignProduct();

        campaignProduct.setProduct( createCampaignProductRequestToProduct( request ) );
        campaignProduct.setCampaign( createCampaignProductRequestToCampaign( request ) );

        return campaignProduct;
    }

    @Override
    public CreateCampaignProductResponse campaignProductFromCreateResponse(CampaignProduct campaignProduct) {
        if ( campaignProduct == null ) {
            return null;
        }

        CreateCampaignProductResponse createCampaignProductResponse = new CreateCampaignProductResponse();

        createCampaignProductResponse.setProductId( campaignProductProductId( campaignProduct ) );
        createCampaignProductResponse.setCampaignId( campaignProductCampaignId( campaignProduct ) );
        createCampaignProductResponse.setId( campaignProduct.getId() );

        return createCampaignProductResponse;
    }

    @Override
    public CampaignProduct campaignProductFromUpdateRequest(UpdateCampaignProductRequest request) {
        if ( request == null ) {
            return null;
        }

        CampaignProduct campaignProduct = new CampaignProduct();

        campaignProduct.setProduct( updateCampaignProductRequestToProduct( request ) );
        campaignProduct.setCampaign( updateCampaignProductRequestToCampaign( request ) );
        campaignProduct.setId( request.getId() );

        return campaignProduct;
    }

    @Override
    public UpdateCampaignProductResponse campaignProductFromUpdateResponse(CampaignProduct campaignProduct) {
        if ( campaignProduct == null ) {
            return null;
        }

        UpdateCampaignProductResponse updateCampaignProductResponse = new UpdateCampaignProductResponse();

        updateCampaignProductResponse.setProductId( campaignProductProductId( campaignProduct ) );
        updateCampaignProductResponse.setCampaignId( campaignProductCampaignId( campaignProduct ) );
        updateCampaignProductResponse.setId( campaignProduct.getId() );

        return updateCampaignProductResponse;
    }

    @Override
    public List<GetAllCampaignProductResponse> campaignProductFromGetAllResponse(List<CampaignProduct> campaignProducts) {
        if ( campaignProducts == null ) {
            return null;
        }

        List<GetAllCampaignProductResponse> list = new ArrayList<GetAllCampaignProductResponse>( campaignProducts.size() );
        for ( CampaignProduct campaignProduct : campaignProducts ) {
            list.add( campaignProductToGetAllCampaignProductResponse( campaignProduct ) );
        }

        return list;
    }

    @Override
    public GetByIdCampaignProductResponse campaignProductFromGetByIdResponse(CampaignProduct campaignProduct) {
        if ( campaignProduct == null ) {
            return null;
        }

        GetByIdCampaignProductResponse getByIdCampaignProductResponse = new GetByIdCampaignProductResponse();

        getByIdCampaignProductResponse.setProductId( campaignProductProductId( campaignProduct ) );
        getByIdCampaignProductResponse.setCampaignId( campaignProductCampaignId( campaignProduct ) );
        getByIdCampaignProductResponse.setId( campaignProduct.getId() );

        return getByIdCampaignProductResponse;
    }

    @Override
    public DeleteCampaignProductResponse campaignProductFromDeleteResponse(CampaignProduct campaignProduct) {
        if ( campaignProduct == null ) {
            return null;
        }

        DeleteCampaignProductResponse deleteCampaignProductResponse = new DeleteCampaignProductResponse();

        deleteCampaignProductResponse.setId( campaignProduct.getId() );

        return deleteCampaignProductResponse;
    }

    protected Product createCampaignProductRequestToProduct(CreateCampaignProductRequest createCampaignProductRequest) {
        if ( createCampaignProductRequest == null ) {
            return null;
        }

        Product product = new Product();

        product.setId( createCampaignProductRequest.getProductId() );

        return product;
    }

    protected Campaign createCampaignProductRequestToCampaign(CreateCampaignProductRequest createCampaignProductRequest) {
        if ( createCampaignProductRequest == null ) {
            return null;
        }

        Campaign campaign = new Campaign();

        campaign.setId( createCampaignProductRequest.getCampaignId() );

        return campaign;
    }

    private UUID campaignProductProductId(CampaignProduct campaignProduct) {
        Product product = campaignProduct.getProduct();
        if ( product == null ) {
            return null;
        }
        return product.getId();
    }

    private UUID campaignProductCampaignId(CampaignProduct campaignProduct) {
        Campaign campaign = campaignProduct.getCampaign();
        if ( campaign == null ) {
            return null;
        }
        return campaign.getId();
    }

    protected Product updateCampaignProductRequestToProduct(UpdateCampaignProductRequest updateCampaignProductRequest) {
        if ( updateCampaignProductRequest == null ) {
            return null;
        }

        Product product = new Product();

        product.setId( updateCampaignProductRequest.getProductId() );

        return product;
    }

    protected Campaign updateCampaignProductRequestToCampaign(UpdateCampaignProductRequest updateCampaignProductRequest) {
        if ( updateCampaignProductRequest == null ) {
            return null;
        }

        Campaign campaign = new Campaign();

        campaign.setId( updateCampaignProductRequest.getCampaignId() );

        return campaign;
    }

    protected GetAllCampaignProductResponse campaignProductToGetAllCampaignProductResponse(CampaignProduct campaignProduct) {
        if ( campaignProduct == null ) {
            return null;
        }

        GetAllCampaignProductResponse getAllCampaignProductResponse = new GetAllCampaignProductResponse();

        getAllCampaignProductResponse.setId( campaignProduct.getId() );

        return getAllCampaignProductResponse;
    }
}
