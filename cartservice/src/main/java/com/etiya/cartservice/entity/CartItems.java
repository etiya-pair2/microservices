package com.etiya.cartservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="cart_items")
public class CartItems {
    @Id
    @GeneratedValue()
    @UuidGenerator()
    private UUID id;

//    private UUID productId;
//    private UUID offerProductsId;
//    private UUID campaignProductId;
    @ManyToOne
    @JoinColumn(name = "cart_id", nullable = false)
    private Cart cart;

    @Column(name="quantity")
    private int quantity;

    @Column(name="unitPrice")
    private int unitPrice;

    @Column(name="productName")
    private String productName;

    @Column(name="offerProductName")
    private String offerProductName;

    @Column(name="campaignProductName")
    private String campaignProductName;

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "updated_date")
    private Date updatedDate;

    @Column(name = "status")
    private Boolean status;

}
