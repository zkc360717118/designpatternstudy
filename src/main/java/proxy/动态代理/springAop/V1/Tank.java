package proxy.动态代理.springAop.V1;



import java.util.Random;

/**
 *
 */
public class Tank {

    /**
     * 模拟坦克移动了一段儿时间
     */
    public void move() {
        System.out.println("Tank moving claclacla...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

