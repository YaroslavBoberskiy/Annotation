/**
 * Created by YB on 25.01.2016.
 */

@Service
public class SomeServiceObject {

    @InitService
    public void service1 () {
        System.out.println("start service 1");
    }

    @InitService
    public void service2 () {
        System.out.println("start service 2");
    }

    @InitService
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
