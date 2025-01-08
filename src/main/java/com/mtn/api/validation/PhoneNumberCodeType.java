package com.mtn.api.validation;




import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = PhoneNumberCodeTypeValidator.class)
public @interface PhoneNumberCodeType {

    public String message() default "PhoneNumber should start with 91";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}