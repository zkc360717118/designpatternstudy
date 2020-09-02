package factory.simpleFactory;

import factory.simpleFactory.AbstractProductWheel;

public class BenzProductWheel extends AbstractProductWheel {
    @Override
    void effect() {
        System.out.println("benz effect");
    }

    @Override
    void run() {
        System.out.println("benz run");
    }
}
