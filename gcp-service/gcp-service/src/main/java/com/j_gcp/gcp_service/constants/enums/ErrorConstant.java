package com.j_gcp.gcp_service.constants.enums;

import lombok.Getter;

@Getter
public enum ErrorConstant {
    CUSTOMER_NOT_FOUND(10001, "there is no customer with this id"),
    BAD_BIRTHDATE(10002, "there is a bad birthdate");

    final String message;
    final int code;
    ErrorConstant(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
