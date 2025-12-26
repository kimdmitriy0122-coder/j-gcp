package com.j_gcp.gcp_service.dto;

import com.j_gcp.gcp_service.constants.enums.CitizenshipType;
import com.j_gcp.gcp_service.constants.enums.DocumentType;
import com.j_gcp.gcp_service.constants.enums.GenderType;
import lombok.Data;

import java.time.LocalDate;

@Data
public class RequestDto {
    private String fio, address, phoneNumber, email;
    private int pinfl, age;
    private GenderType genderType;
    private DocumentType documentType;
    private LocalDate expiryDate, givenDate;
    private CitizenshipType citizenshipType;
}
