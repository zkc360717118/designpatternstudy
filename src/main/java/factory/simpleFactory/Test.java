package factory.simpleFactory;

public class Test {
    public static void main(String[] args) {
//        AbstractProductEngine car = CarFactory.createEngine("benz");
        AbstractProductEngine car = CarFactory.createEngine("ford");

        car.getPower();

    }
}
