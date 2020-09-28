package 访问者模式.v1.city;

import 访问者模式.visitor.Visitor;

public class Shenzhen implements City {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
