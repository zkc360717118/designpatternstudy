package factory.abstractFactory;

/**
 * 1、如果要切换工厂，只需要在最开始初始化工厂类的时候换另一家工厂就好了，而整个结构都无需改动。
 * 2、如果增加部件，抽象工厂接口以及其子工厂都需要添加能生产此部件的方法，同时还需要添加一个此部件的抽象接口以及每种工厂生产这种部件的具体方法，
 *      好处是已有的部件类不需要改动。
 * 3、如果增加工厂，首先需要增加此工厂并实现抽象工厂类，同时需要在每个抽象部件那里加一个此工厂生产对应部件的具体类，好处是已有工厂类和部件类都不需要改动。
 *
 * 综上所述，抽象工厂模式基本上完美的遵循了开放封闭原则，即使第二种情况需要修改已有的工厂类，但由于工厂类的职责是去初始化并返回一个真正的部件生产类，
 * 因此已有的核心类部件类依然没有因为扩展而做过任何修改。
 */
public class Test {
    public static void main(String[] args) {

//        AbstractCarFactory  factory = new ConcreteFordFactry();
        AbstractCarFactory  factory = new ConcreteBenzFactry();

        factory.createProductEngine().getPower();
        factory.createProductWheel().effect();
        factory.createProductFrame().secure();
    }
}
