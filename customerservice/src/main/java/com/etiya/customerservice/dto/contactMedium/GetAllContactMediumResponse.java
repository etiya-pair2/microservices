package com.etiya.customerservice.dto.contactMedium;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class GetAllContactMediumResponse {
    private UUID id;
    private UUID customerId;
    private String email;
    private Long homePhone;
    private Long mobilePhone;
    private String fax;
}
