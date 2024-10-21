package com.ead.authuser.validation;

import java.lang.annotation.*;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Documented
@Constraint(validatedBy = UsernameConstraintImpl.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface UsernameConstraint {
    String message() default "Invalid username";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}