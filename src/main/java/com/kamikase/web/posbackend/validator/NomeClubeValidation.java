package com.kamikase.web.posbackend.validator;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;


@Target( { ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = NomeClubeValidator.class)
public @interface NomeClubeValidation {
    String message() default "Não é permitido incluir no nome do clube a palavra: ";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
