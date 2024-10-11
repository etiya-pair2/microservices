package com.etiya.productservice.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Getter
@Embeddable
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ProductAttributeId implements Serializable {

    private UUID productId;
    private int attributeId;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductAttributeId that = (ProductAttributeId) o;
        return Objects.equals(productId, that.productId) &&
                Objects.equals(attributeId, that.attributeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, attributeId);
    }



}
