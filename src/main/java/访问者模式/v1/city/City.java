package 访问者模式.v1.city;

import 访问者模式.visitor.Visitor;

public interface City {
    public void accept(Visitor visitor);
}
