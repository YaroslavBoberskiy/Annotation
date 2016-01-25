import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by YB on 25.01.2016.
 */
public class ServiceManager {

    public void runServiceMgr(Class clss) {

        Annotation annotation = clss.getAnnotation(Service.class);

        if (annotation instanceof Service) {
            System.out.println("Annotation Service is present in class " + clss.getSimpleName());
        }
    }
}
