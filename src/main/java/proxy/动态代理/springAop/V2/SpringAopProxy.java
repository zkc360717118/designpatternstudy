package proxy.动态代理.springAop.V2;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import proxy.动态代理.springAop.V2.Tank;

public class SpringAopProxy {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app_auto.xml");
        proxy.动态代理.springAop.V2.Tank tank = (Tank)context.getBean("tank");
        tank.move();
    }
}
