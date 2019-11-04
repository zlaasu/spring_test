package org.zlasu.validate;

        import javax.validation.Constraint;
        import javax.validation.Payload;
        import java.lang.annotation.ElementType;
        import java.lang.annotation.Retention;
        import java.lang.annotation.RetentionPolicy;
        import java.lang.annotation.Target;

@Constraint(validatedBy = ListSizeValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ListSize {

    int max();
    String message() default "{pl.coderslab.validate.MaxListSize.message}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
