package 访问者模式.v1.city;

import 访问者模式.v1.visitor.Visitor;

public class Shanghai implements City {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
