package proxy.动态代理.springAop.V1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAopProxy {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
        Tank tank = (Tank)context.getBean("tank");
        tank.move();
    }
}
