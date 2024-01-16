package com.artemoleshev.spring.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = CheckEmailValidator.class)
@Target( {ElementType.METHOD, ElementType.FIELD} )
@Retention(RetentionPolicy.RUNTIME)
public @interface CheckEmail {
	public String value() default "xyz.com";
	public String message() default "email must ends with xyz.com";
	
	public Class<?>[] groups() default {};
	public Class<? extends Payload>[] payload() default {};
}
