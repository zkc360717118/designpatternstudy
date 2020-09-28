package 访问者模式.v1.visitor;


import 访问者模式.v1.city.Beijing;
import 访问者模式.v1.city.Shanghai;
import 访问者模式.v1.city.Shenzhen;

public interface Visitor {
    public  void visit(Beijing beijing);
    public  void visit(Shanghai shanghai);
    public  void visit(Shenzhen shenzhen);
}
