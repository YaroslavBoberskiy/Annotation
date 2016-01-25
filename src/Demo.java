/**
 * Created by YB on 25.01.2016.
 */
public class Demo {

    public static void main(String[] args) {

        SomeServiceObject sso = new SomeServiceObject();
        ServiceManager smgr = new ServiceManager();

        smgr.runServiceMgr(sso.getClass());

    }

}
