package com.j_gcp.gcp_service.handler;


import com.j_gcp.gcp_service.constants.enums.ErrorConstant;
import com.j_gcp.gcp_service.dto.ErrorDto;
import com.j_gcp.gcp_service.exceptions.CustomerNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.JsonMappingException;

import java.util.Objects;
import java.util.stream.Collectors;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(CustomerNotFoundException.class)
    public ResponseEntity<ErrorDto> customerNotFound(){
        ErrorConstant customerNotFound = ErrorConstant.CUSTOMER_NOT_FOUND;

        return new ResponseEntity<>(
            new ErrorDto(customerNotFound.getCode(), customerNotFound.getMessage()),
            HttpStatus.BAD_REQUEST
        );
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorDto> notValidDate(MethodArgumentNotValidException exception){

        ErrorConstant badBirthdate = ErrorConstant.BAD_DATE;
        return ResponseEntity
            .badRequest()
            .body(new ErrorDto(
                badBirthdate.getCode(),
                exception.getBindingResult().getFieldError().getDefaultMessage())
            );
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<ErrorDto> valueNotInEnum(HttpMessageNotReadableException exception){
        tools.jackson.databind.exc.InvalidFormatException e = (tools.jackson.databind.exc.InvalidFormatException) exception.getRootCause();
        return ResponseEntity
            .badRequest()
            .body(new ErrorDto(
                ErrorConstant.VALUE_NOT_IN_ENUM.getCode(),
                ErrorConstant.VALUE_NOT_IN_ENUM.getMessage()
                    .concat(". problem value is " + e.getValue())
            ));
    }
}
