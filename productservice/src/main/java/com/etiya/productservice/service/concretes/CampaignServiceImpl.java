package com.etiya.productservice.service.concretes;

import com.etiya.productservice.dto.campaign.*;
import com.etiya.productservice.entity.Campaign;
import com.etiya.productservice.mapper.CampaignMapper;
import com.etiya.productservice.repository.CampaignRepository;
import com.etiya.productservice.service.abstracts.CampaignService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CampaignServiceImpl implements CampaignService {

    private final CampaignRepository campaignRepository;

    CampaignMapper campaignMapper = CampaignMapper.INSTANCE;
    @Override
    public List<GetAllCampaignResponse> getAll() {
        return campaignMapper.campaignFromGetAllResponse(campaignRepository.findAll());
    }

    @Override
    public CreateCampaignResponse create(CreateCampaignRequest request) {
        Campaign campaign = campaignRepository.save(campaignMapper.campaignFromCreateRequest(request));
        return campaignMapper.campaignFromCreateResponse(campaign);
    }

    @Override
    public UpdateCampaignResponse update(UpdateCampaignRequest request) {
        Campaign campaign = campaignRepository.save(campaignMapper.campaignFromUpdateRequest(request));
        return campaignMapper.campaignFromUpdateResponse(campaign);
    }

    @Override
    public DeleteCampaignResponse delete(UUID id) {
        campaignRepository.deleteById(id);
        return campaignMapper.campaignFromDeleteResponse(campaignRepository.findById(id).orElseThrow());
    }
}
