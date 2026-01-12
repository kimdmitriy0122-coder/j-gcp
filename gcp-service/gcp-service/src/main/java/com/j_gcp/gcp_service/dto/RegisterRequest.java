package com.j_gcp.gcp_service.dto;

import com.j_gcp.gcp_service.constants.enums.CitizenshipType;
import com.j_gcp.gcp_service.constants.enums.DocumentType;
import com.j_gcp.gcp_service.constants.enums.GenderType;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public record RegisterRequest(
    @Pattern(regexp = "^[a-zA-Z ]+",
        message = "only latin letters available") String firstName,
    @Pattern(regexp = "^[a-zA-Z ]+",
        message = "only latin letters available") String lastName,
    @Size(max = 100, message = "too many simbols in address field") String address,
    @Pattern(regexp = "^\\+?998\\d{9}") String phoneNumber,
    @Email(message = "email invalid") String email,
    @Pattern(regexp = "^[a-zA-Z0-9]{2,4}",
        message = "invalid passport serial") String passportSerial,
    @Digits(integer = 7, fraction = 0) int passportNumber,
    @Digits(integer = 14, fraction = 0) Long pinfl,
    @Digits(integer = 3, fraction = 0)int age,
    GenderType genderType,
    DocumentType documentType,
    LocalDate expiryDate,
    LocalDate givenDate,
    CitizenshipType citizenshipType
) {}
