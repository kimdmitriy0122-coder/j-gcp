package com.j_gcp.gcp_service.handler;

import com.j_gcp.gcp_service.constants.enums.ErrorConstant;
import com.j_gcp.gcp_service.dto.ErrorDto;
import com.j_gcp.gcp_service.exceptions.CustomerNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(CustomerNotFoundException.class)
    public ResponseEntity<ErrorDto> customerNotFound(CustomerNotFoundException exception){
        ErrorConstant customerNotFound = ErrorConstant.CUSTOMER_NOT_FOUND;
        return new ResponseEntity<>(
            new ErrorDto(customerNotFound.getCode(), customerNotFound.getMessage()),
            HttpStatus.NOT_FOUND
        );
    }
}
