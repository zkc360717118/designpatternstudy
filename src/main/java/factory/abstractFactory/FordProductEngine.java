package factory.abstractFactory;

public class FordProductEngine extends AbstractProductEngine {
    @Override
    void getPower() {
        System.out.println("ford power is ready");
    }
}
