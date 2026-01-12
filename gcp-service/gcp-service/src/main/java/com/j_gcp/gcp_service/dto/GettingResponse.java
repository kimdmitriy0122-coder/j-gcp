package com.j_gcp.gcp_service.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.j_gcp.gcp_service.constants.enums.CitizenshipType;
import com.j_gcp.gcp_service.constants.enums.DocumentType;
import com.j_gcp.gcp_service.constants.enums.GenderType;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;

import java.time.LocalDate;
import java.time.OffsetDateTime;

public record GettingResponse(
    Long id,
    @JsonFormat(
        shape = JsonFormat.Shape.STRING,
        pattern = "dd.MM.yyyy HH:mm:ss",
        timezone = "UTC"
    )
    OffsetDateTime registrationDate
){}
