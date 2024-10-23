package com.etiya.productservice.mapper;

import com.etiya.productservice.dto.campaign.CreateCampaignRequest;
import com.etiya.productservice.dto.campaign.CreateCampaignResponse;
import com.etiya.productservice.dto.campaign.DeleteCampaignResponse;
import com.etiya.productservice.dto.campaign.GetAllCampaignResponse;
import com.etiya.productservice.dto.campaign.GetByIdCampaignResponse;
import com.etiya.productservice.dto.campaign.UpdateCampaignRequest;
import com.etiya.productservice.dto.campaign.UpdateCampaignResponse;
import com.etiya.productservice.entity.Campaign;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-23T12:35:28+0300",
    comments = "version: 1.6.0, compiler: javac, environment: Java 23 (Oracle Corporation)"
)
public class CampaignMapperImpl implements CampaignMapper {

    @Override
    public Campaign campaignFromCreateRequest(CreateCampaignRequest request) {
        if ( request == null ) {
            return null;
        }

        Campaign campaign = new Campaign();

        campaign.setName( request.getName() );
        campaign.setDiscount( request.getDiscount() );

        return campaign;
    }

    @Override
    public CreateCampaignResponse campaignFromCreateResponse(Campaign campaign) {
        if ( campaign == null ) {
            return null;
        }

        CreateCampaignResponse createCampaignResponse = new CreateCampaignResponse();

        createCampaignResponse.setId( campaign.getId() );
        createCampaignResponse.setName( campaign.getName() );
        createCampaignResponse.setDiscount( campaign.getDiscount() );
        createCampaignResponse.setStatus( campaign.isStatus() );
        createCampaignResponse.setCreatedDate( campaign.getCreatedDate() );

        return createCampaignResponse;
    }

    @Override
    public Campaign campaignFromUpdateRequest(UpdateCampaignRequest request) {
        if ( request == null ) {
            return null;
        }

        Campaign campaign = new Campaign();

        campaign.setId( request.getId() );
        campaign.setName( request.getName() );
        campaign.setStatus( request.isStatus() );
        campaign.setDiscount( request.getDiscount() );

        return campaign;
    }

    @Override
    public UpdateCampaignResponse campaignFromUpdateResponse(Campaign campaign) {
        if ( campaign == null ) {
            return null;
        }

        UpdateCampaignResponse updateCampaignResponse = new UpdateCampaignResponse();

        updateCampaignResponse.setId( campaign.getId() );
        updateCampaignResponse.setName( campaign.getName() );
        updateCampaignResponse.setStatus( campaign.isStatus() );
        updateCampaignResponse.setDiscount( campaign.getDiscount() );
        updateCampaignResponse.setCreatedDate( campaign.getCreatedDate() );

        return updateCampaignResponse;
    }

    @Override
    public List<GetAllCampaignResponse> campaignFromGetAllResponse(List<Campaign> campaigns) {
        if ( campaigns == null ) {
            return null;
        }

        List<GetAllCampaignResponse> list = new ArrayList<GetAllCampaignResponse>( campaigns.size() );
        for ( Campaign campaign : campaigns ) {
            list.add( campaignToGetAllCampaignResponse( campaign ) );
        }

        return list;
    }

    @Override
    public GetByIdCampaignResponse campaignFromGetByIdResponse(Campaign campaign) {
        if ( campaign == null ) {
            return null;
        }

        GetByIdCampaignResponse getByIdCampaignResponse = new GetByIdCampaignResponse();

        getByIdCampaignResponse.setId( campaign.getId() );
        getByIdCampaignResponse.setName( campaign.getName() );
        getByIdCampaignResponse.setDiscount( campaign.getDiscount() );
        getByIdCampaignResponse.setStatus( campaign.isStatus() );
        getByIdCampaignResponse.setCreatedDate( campaign.getCreatedDate() );

        return getByIdCampaignResponse;
    }

    @Override
    public DeleteCampaignResponse campaignFromDeleteResponse(Campaign campaign) {
        if ( campaign == null ) {
            return null;
        }

        DeleteCampaignResponse deleteCampaignResponse = new DeleteCampaignResponse();

        deleteCampaignResponse.setId( campaign.getId() );
        deleteCampaignResponse.setName( campaign.getName() );

        return deleteCampaignResponse;
    }

    protected GetAllCampaignResponse campaignToGetAllCampaignResponse(Campaign campaign) {
        if ( campaign == null ) {
            return null;
        }

        GetAllCampaignResponse getAllCampaignResponse = new GetAllCampaignResponse();

        getAllCampaignResponse.setId( campaign.getId() );
        getAllCampaignResponse.setName( campaign.getName() );
        getAllCampaignResponse.setDiscount( campaign.getDiscount() );
        getAllCampaignResponse.setStatus( campaign.isStatus() );
        getAllCampaignResponse.setCreatedDate( campaign.getCreatedDate() );

        return getAllCampaignResponse;
    }
}
