package com.j_gcp.gcp_service.validation.validators;

import com.j_gcp.gcp_service.validation.BirthdateConstraint;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.LocalDate;

public class BirthdateValidator implements ConstraintValidator<BirthdateConstraint, LocalDate> {
    @Override
    public boolean isValid(LocalDate birthdate,
                           ConstraintValidatorContext constraintValidatorContext) {

        return birthdate.isBefore(LocalDate.now());
    }
}
