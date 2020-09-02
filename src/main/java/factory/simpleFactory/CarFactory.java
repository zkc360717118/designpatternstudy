package factory.simpleFactory;

public class CarFactory {
    public static AbstractProductWheel createWheel(String type) {
        if("benz".equals(type)){
            return new BenzProductWheel();
        }else if("ford".equals(type)){
            return new FordProductWheel();
        }
        return null;
    }

    public static AbstractProductEngine createEngine(String type) {
        if("benz".equals(type)){
            return new BenzProductEngine();
        }else if("ford".equals(type)){
            return new FordProductEngine();
        }
        return null;
    }
}
