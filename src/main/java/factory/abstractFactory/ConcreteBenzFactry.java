package factory.abstractFactory;

public class ConcreteBenzFactry extends AbstractCarFactory {
    @Override
    AbstractProductWheel createProductWheel() {
        return new BenzProductWheel();
    }

    @Override
    AbstractProductFrame createProductFrame() {

        return new BenzProductFrame();
    }

    @Override
    AbstractProductEngine createProductEngine() {

        return new BenzProductEngine();
    }
}
