package dto.cartitems;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateCartItemRequest {
    private UUID id;
    private UUID cartId;
    private int quantity;
    private int unitPrice;
    private String productName;
    private String offerProductName;
    private String campaignProductName;
    private Date updatedDate;
    private Boolean status;
}

