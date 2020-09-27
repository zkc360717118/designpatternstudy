package proxy.动态代理.springAop.V1;

public class TimeProxy {

    public void before() {
        System.out.println("method start.." + System.currentTimeMillis());
    }

    public void after() {
        System.out.println("method stop.." + System.currentTimeMillis());
    }

}
