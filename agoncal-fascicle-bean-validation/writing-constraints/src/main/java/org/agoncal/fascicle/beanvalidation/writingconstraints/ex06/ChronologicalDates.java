package org.agoncal.fascicle.beanvalidation.writingconstraints.ex06;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
@Target(TYPE)
@Retention(RUNTIME)
@Constraint(validatedBy = ChronologicalDatesValidator.class)
public @interface ChronologicalDates {

  String message() default "Dates have to be in chronological order";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};
}
