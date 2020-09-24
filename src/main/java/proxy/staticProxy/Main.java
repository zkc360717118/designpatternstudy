package proxy.V1;

/**
 * 有个坦克类，你想在在方法执行中加上执行时间，执行日志，但是你无法直接使用这个方法（别人的接口）（不能改动原来的代码）
 *
 * 1.创建一个接口类Movable
 * 2.被代理的类 ，和各种代理类都实现同样的接口
 */
public class Main {
    public static void main(String[] args) {
        TankTimeProxy tankTimeProxy = new TankTimeProxy(new Tank());
        TankLogProxy tankLogProxy = new TankLogProxy(tankTimeProxy);
        tankLogProxy.move();
    }
}

interface Movable {
    void move();
}

class TankTimeProxy implements Movable{
    private Movable presentedObject; //被代理的对象
    public TankTimeProxy(Movable m) {
        this.presentedObject = m;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        this.presentedObject.move();
        long end = System.currentTimeMillis();
        System.out.println("time is :"+ (end-start));

    }
}

class TankLogProxy implements Movable{
    private Movable presentedObject; //被代理的对象
    public TankLogProxy(Movable m) {
        this.presentedObject = m;
    }

    @Override
    public void move() {
        System.out.println("log start");
        this.presentedObject.move();
        System.out.println("log end");
    }
}

class Tank implements Movable{
    public Tank() {
    }

    public void move() {
//        long start = System.currentTimeMillis();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("i am moving");
//        long end = System.currentTimeMillis();
//        System.out.println((end-start)/1000);
    }
}
