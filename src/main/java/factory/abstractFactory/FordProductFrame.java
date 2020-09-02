package factory.abstractFactory;

public class FordProductFrame extends AbstractProductFrame {
    @Override
    void secure() {
        System.out.println("ford is secure ,because it is big");
    }
}
