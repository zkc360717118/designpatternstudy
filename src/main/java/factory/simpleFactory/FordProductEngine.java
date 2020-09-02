package factory.simpleFactory;

public class FordProductEngine extends AbstractProductEngine {
    @Override
    void getPower() {
        System.out.println("ford power is ready");
    }
}
