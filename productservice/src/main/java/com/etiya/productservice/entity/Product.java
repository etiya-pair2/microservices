package com.etiya.productservice.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="product")

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name="id")
    private UUID id;

    @ManyToOne
    @NotNull
    @JoinColumn (name="category_id")
    private Category category;

    @NotNull
    @Column(name="unit_price")
    private double unitPrice;

    @Column(name="quantity")
    private int quantity;


}
