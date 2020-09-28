package 访问者模式.v1.visitor;


import 访问者模式.v1.city.Beijing;
import 访问者模式.v1.city.Shanghai;
import 访问者模式.v1.city.Shenzhen;

public class SingleVisitor implements Visitor {
    @Override
    public void visit(Beijing beijing) {
        System.out.println("hi Bj");
    }

    @Override
    public void visit(Shanghai sh) {
        System.out.println("hi sh ");

    }

    @Override
    public void visit(Shenzhen sz) {
        System.out.println("hi sz");

    }
}
