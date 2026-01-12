package com.j_gcp.gcp_service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.CreationTimestamp;

import java.time.OffsetDateTime;

@SuperBuilder
@Table(name = "customers", schema = "java-core")
@Entity
@RequiredArgsConstructor
@Getter
@Setter
public class Customer{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column
    private Long pinfl;
    @Column(name = "birth_date")
    private OffsetDateTime birthDate;
    @Column(name = "passport_date")
    private OffsetDateTime passportDate;
    @Column(name="registration_date")
    @CreationTimestamp
    private OffsetDateTime registrationDate;
}
