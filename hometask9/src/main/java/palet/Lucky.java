package palet;

import java.lang.annotation.*;

@Target(value = ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Lucky {
    boolean lucky() default false;
}
