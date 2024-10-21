package com.etiya.productservice.dto.campaign;

import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class GetByIdCampaignResponse {
    private UUID id;
    private String name;
    private boolean status;
    private Date startDate;
    private Date endDate;
}
