package com.j_gcp.gcp_service.dto;

import com.j_gcp.gcp_service.constants.enums.ErrorConstant;

public record ErrorDto(
    int code,
    String message
) {}
