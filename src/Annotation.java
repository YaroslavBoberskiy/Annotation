/**
 * Created by YB on 24.01.2016.
 */
import java.lang.annotation.*;

public class Annotation {

    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Service{
        boolean isService() default true;
    }
}
