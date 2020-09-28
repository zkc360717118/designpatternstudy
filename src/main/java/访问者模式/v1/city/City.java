package 访问者模式.v1.city;


import 访问者模式.v1.visitor.Visitor;

public interface City {
    void accept(Visitor visitor);
}
