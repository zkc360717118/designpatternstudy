package 访问者模式.city;

import 访问者模式.visitor.Visitor;

public class Shanghai implements City {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
