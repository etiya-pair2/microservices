package com.etiya.productservice.mapper;

import com.etiya.productservice.dto.campaign.CreateCampaignRequest;
import com.etiya.productservice.dto.campaignProduct.*;
import com.etiya.productservice.dto.category.*;
import com.etiya.productservice.entity.CampaignProduct;
import com.etiya.productservice.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CampaignProductMapper {

    CampaignProductMapper INSTANCE = Mappers.getMapper(CampaignProductMapper.class);

    CampaignProduct campaignProductFromCreateRequest(CreateCampaignProductRequest request);

    CreateCampaignProductResponse campaignProductFromCreateResponse (CampaignProduct campaignProduct);

    CampaignProduct campaignProductFromUpdateRequest(UpdateCampaignProductRequest request);

    UpdateCampaignProductResponse campaignProductFromUpdateResponse(CampaignProduct campaignProduct);

    List<GetAllCampaignProductResponse> campaignProductFromGetAllResponse(List<CampaignProduct> campaignProducts);

    GetByIdCampaignProductResponse campaignProductFromGetByIdResponse(CampaignProduct campaignProduct);

    DeleteCampaignProductResponse campaignProductFromDeleteResponse(CampaignProduct campaignProduct);
}
