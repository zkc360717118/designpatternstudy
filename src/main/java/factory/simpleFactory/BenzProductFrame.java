package factory.simpleFactory;

public class BenzProductFrame extends AbstractProductFrame {
    @Override
    void secure() {
        System.out.println("get benz Frame and it is strong");
    }
}
