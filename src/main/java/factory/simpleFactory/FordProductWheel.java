package factory.simpleFactory;

import factory.simpleFactory.AbstractProductWheel;

public class FordProductWheel extends AbstractProductWheel {
    @Override
    void effect() {
        System.out.println("ford effect");
    }

    @Override
    void run() {
        System.out.println("ford is running");
    }
}
