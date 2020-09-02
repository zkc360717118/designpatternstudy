package factory.abstractFactory;

public class ConcreteFordFactry extends AbstractCarFactory {
    @Override
    AbstractProductWheel createProductWheel() {
        return new FordProductWheel();
    }

    @Override
    AbstractProductFrame createProductFrame() {

        return new FordProductFrame();
    }

    @Override
    AbstractProductEngine createProductEngine() {

        return new FordProductEngine();
    }
}
