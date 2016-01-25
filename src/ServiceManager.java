import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by YB on 25.01.2016.
 */
public class ServiceManager {

    public void runServiceMgr (Object object) {
        Method mthd [] = object.getClass().getMethods();

        for (Method m : mthd) {
            for (Annotation a : m.getAnnotations()) {
                if (a instanceof Service) {
                    try {
                        m.invoke(object, m.getParameterTypes());
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

}
