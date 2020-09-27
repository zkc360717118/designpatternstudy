package proxy.动态代理;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Random;

/**
 * cglib 动态代理
 * 问题是： 如果被代理的类是Final的话，就不能使用cglig生成动态代理类
 */
public class CglibProxy {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Tank.class); //意味着，动态代理生成的类是tank类的子类
        enhancer.setCallback(new TimeMethodInterceptor());
        Tank o = (Tank)enhancer.create();
        o.move();
    }
}

class TimeMethodInterceptor implements MethodInterceptor {


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println(o.getClass().getSuperclass().getName()); //意味着，动态代理生成的类是tank类的子类
        System.out.println("before function happens here");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("after the execution happened");

        return result;
    }
}


class Tank {
    public void move() {
        System.out.println("Tank moving claclacla...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
