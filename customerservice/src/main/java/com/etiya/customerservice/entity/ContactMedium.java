package com.etiya.customerservice.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
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
@Table(name="contact_mediums")
public class ContactMedium {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;


    @JoinColumn(name = "customer_id")
    @ManyToOne
    private Customer customer;

    @NotNull
    @Email
    @Column(name = "email")
    private String email;


    @Column(name = "home_phone")
    private Long homePhone;

    @NotNull
    @Column(name = "mobile_phone")
    private Long mobilePhone;

    @NotNull
    @Column(name = "fax")
    private String fax;





}
