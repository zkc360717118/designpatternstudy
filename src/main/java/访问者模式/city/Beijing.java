package 访问者模式.city;

import 访问者模式.visitor.Visitor;

public class Beijing implements City {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
