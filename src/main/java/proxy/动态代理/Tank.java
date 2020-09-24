package proxy.动态代理;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Random;

/**
 * * 如果想让静态代理中LogProxy可以重用，不仅可以代理Tank，还可以代理任何其他可以代理的类型
 *  * （毕竟日志记录，时间计算是很多方法都需要的东西），这时该怎么做呢？
 *  * 分离代理行为与被代理对象
 *  * 使用jdk的动态代理
 */
public class Tank  implements Movable{

    @Override
    public void move() {

        System.out.println("Tank moving claclacla...");
        try {
            Thread.sleep(new Random().nextInt(4000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Tank tank = new Tank();
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true"); //如果这里开启ture，会把动态生成的类保存起来，方便观察
//        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles","true"); // jdk11


        //reflection 通过二进制字节码分析类的属性和方法
        // 这里的proxyClass对象 就是 上面保存起来的动态类$Proxy0， proxyClass.move()  ==》 源码中的super.h.invoke()  ,这里的h 就是LogHandler,which is passed when the dynamic class initalized.
        Movable proxyClass = (Movable)Proxy.newProxyInstance(Tank.class.getClassLoader(), //指定classloader（最好写被代理类的那个类加载器）
                new Class[]{Movable.class},  //被代理对象应该实现哪些接口
                new LogHandler(tank)  // 被代理对象在被调用的时候，做什么处理
        );

        proxyClass.move(); //move被调用时候，经过LogHandler以后增加了处理逻辑 调用了下面的invoke 方法
    }
}

interface Movable {
    void move();
}

class LogHandler implements InvocationHandler {
    Tank tank;

    public LogHandler(Tank tank) {
        this.tank = tank;
    }
    public void before() {
        System.out.println("method start..");
    }

    public void after() {
        System.out.println("method stop..");
    }

    /**
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        Arrays.stream(proxy.getClass().getMethods())
//                .map(Method::getName)
//                .forEach(System.out::println);

        before();// 增加的业务逻辑1

        Object invoke = method.invoke(tank, args); // 被代理对象的方法

        after(); //// 增加的业务逻辑2

        return invoke;
    }
}
