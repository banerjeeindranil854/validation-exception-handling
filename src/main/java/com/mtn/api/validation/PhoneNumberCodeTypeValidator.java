package com.mtn.api.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberCodeTypeValidator implements ConstraintValidator<PhoneNumberCodeType, String> {


    @Override
    public void initialize(PhoneNumberCodeType constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String phoneNumber, ConstraintValidatorContext constraintValidatorContext) {
        Pattern ptrn = Pattern.compile("^(?:0091|\\\\+91|0)[7-9][0-9]{9}$");
        Matcher match = ptrn.matcher(phoneNumber);
        return (match.find() && match.group().equals(phoneNumber));
    }
}
