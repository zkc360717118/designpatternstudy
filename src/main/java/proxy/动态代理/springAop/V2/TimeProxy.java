package proxy.动态代理.springAop.V2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TimeProxy {
    @Before("execution(void proxy.动态代理.springAop.V2.Tank.move())")
    public void before() {
        System.out.println("method 动态代理方法之，  之前干点事儿.." + System.currentTimeMillis());

    }
    @After("execution(void proxy.动态代理.springAop.V2.Tank.move())")
    public void after() {
        System.out.println("method 动态代理方法之，  之后干点事儿" + System.currentTimeMillis());
    }

}
