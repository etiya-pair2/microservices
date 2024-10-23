package com.etiya.productservice.dto.campaign;

import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class UpdateCampaignRequest {
    private UUID id;
    private String name;
    private double discount;
    private boolean status;
}
