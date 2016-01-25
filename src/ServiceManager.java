import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by YB on 25.01.2016.
 */
public class ServiceManager {

    public void runServiceMgr(Class clss) {

        if (clss.isAnnotationPresent(Service.class)) {
            System.out.println("Annotation Service is present in class " + clss.getSimpleName());
            Method mthd [] = clss.getMethods();

            for (Method m : mthd) {
                for (Annotation a : m.getAnnotations()) {
                    if (a instanceof InitService) {
                        try {
                            m.invoke(clss.newInstance(), m.getParameterTypes());
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e) {
                            e.printStackTrace();
                        } catch (InstantiationException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
