package com.j_gcp.gcp_service.constants.enums;

import lombok.Getter;

@Getter
public enum ErrorConstant {
    CUSTOMER_NOT_FOUND(10001, "there is no customer with this id"),
    BAD_DATE(10002, "date is not valid"),
    VALUE_NOT_IN_ENUM(10003, "input value is not in enum");

    final String message;
    final int code;
    ErrorConstant(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
