/**
 * Created by YB on 25.01.2016.
 */
public class SomeServiceObject {

    @Service
    public void service1 () {
        System.out.println("start service 1");
    }

    @Service
    public void service2 () {
        System.out.println("start service 2");
    }

    @Service
    public void service3 () {
        System.out.println("start service 3");
    }

    public void  notService1 () {
        System.out.println("not service 1");
    }

    public void  notService2 () {
        System.out.println("not service 2");
    }

}
