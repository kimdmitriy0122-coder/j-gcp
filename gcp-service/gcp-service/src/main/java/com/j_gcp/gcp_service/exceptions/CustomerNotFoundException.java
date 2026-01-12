package com.j_gcp.gcp_service.exceptions;

public class CustomerNotFoundException extends RuntimeException {
    public CustomerNotFoundException(final String message) {
        super(message);
    }
}
