package com.etiya.productservice.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="product_attributes")
public class ProductAttribute {
    @EmbeddedId
    private ProductAttributeId id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    @MapsId("productId")
    private Product product;

    @Column(name="value")
    private int value;


    @ManyToOne
    @JoinColumn(name="attribute_id")
    @MapsId("attributeId")
    private Attribute attribute;



}
