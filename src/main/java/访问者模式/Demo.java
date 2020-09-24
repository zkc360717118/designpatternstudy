package 访问者模式;

import 访问者模式.city.TravelCities;
import 访问者模式.visitor.SingleVisitor;

public class Demo {
    public static void main(String[] args) {
        TravelCities travelCities = new TravelCities();
        travelCities.accept(new SingleVisitor());
    }
}
