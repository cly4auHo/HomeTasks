package paket;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;


@Retention(RetentionPolicy.RUNTIME)
public @interface AnooTest {
    String val() default "Hi";
    int age() default 14;
}
