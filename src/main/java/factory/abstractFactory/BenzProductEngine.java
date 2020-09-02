package factory.abstractFactory;

public class BenzProductEngine extends AbstractProductEngine {
    @Override
    void getPower() {
        System.out.println("get power from engine");
    }
}
