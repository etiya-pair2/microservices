package com.etiya.customerservice.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="individual_customers")
public class IndividualCustomer {
    @Id
    @JoinColumn(name = "customer_id")
    @OneToOne
    private Customer customer;

    @NotNull
    @Column(name = "firstName")
    private String firstName;

    @Column(name = "middleName")
    private String middleName;
    @NotNull
    @Column(name = "lastName")
    private String lastName;
    @NotNull

    @Column(name = "gender")
    private String gender;

    @NotNull
    @Column(name = "birthday")
    private Date birthday;


    @Column(name = "motherName")
    private String motherName;


    @Column(name = "fatherName")
    private String fatherName;

    @NotNull
    @Column(name = "nationalityId")
    private String nationalityId;


}
