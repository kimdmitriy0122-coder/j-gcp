package com.j_gcp.gcp_service.exceptions;

import org.springframework.core.MethodParameter;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;

public class NotValidBirthdate extends MethodArgumentNotValidException {
    public NotValidBirthdate(MethodParameter parameter, BindingResult bindingResult) {
        super(parameter, bindingResult);
    }
}
