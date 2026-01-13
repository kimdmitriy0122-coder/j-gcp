package com.j_gcp.gcp_service.entity;

import com.j_gcp.gcp_service.constants.enums.CitizenshipType;
import com.j_gcp.gcp_service.constants.enums.DocumentType;
import com.j_gcp.gcp_service.constants.enums.GenderType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
    private LocalDate birthDate;
    @Column(name = "passport_date")
    private LocalDate passportDate;
    @Column(name="registration_date")
    @CreationTimestamp
    private LocalDateTime registrationDate;
    @Enumerated(EnumType.STRING)
    @Column(name = "gender_type")
    private GenderType genderType;
    @Enumerated(EnumType.STRING)
    @Column(name = "document_type")
    DocumentType documentType;
    @Column(name = "expiry_date")
    LocalDate expiryDate;
    @Enumerated(EnumType.STRING)
    @Column(name = "citizenship_type")
    CitizenshipType citizenshipType;
    @Column(name = "phone_number")
    private Long phoneNumber;
    @Column(name = "passport_serial")
    private String passportSerial;
    @Column(name = "passport_number")
    private Long passportNumber;
    private String email;
}
