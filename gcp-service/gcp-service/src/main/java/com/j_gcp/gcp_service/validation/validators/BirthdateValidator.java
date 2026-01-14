package com.j_gcp.gcp_service.validation.validators;

import com.j_gcp.gcp_service.validation.BeforeNowDate;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.LocalDate;

public class BirthdateValidator implements ConstraintValidator<BeforeNowDate, LocalDate> {
    @Override
    public boolean isValid(LocalDate birthdate,
                           ConstraintValidatorContext constraintValidatorContext) {
        System.out.println(birthdate.isBefore(LocalDate.now()));
        return birthdate.isBefore(LocalDate.now());
    }
}
