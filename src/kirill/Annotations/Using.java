package kirill.Annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface Using {
    String name() default "Anonymous";
    String why() default "hu is it";
}
