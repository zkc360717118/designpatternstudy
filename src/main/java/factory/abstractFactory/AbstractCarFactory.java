package factory.abstractFactory;

abstract class AbstractCarFactory {
    abstract AbstractProductWheel createProductWheel();
    abstract AbstractProductFrame createProductFrame();
    abstract AbstractProductEngine createProductEngine();
}
