package 访问者模式.v1.city;

import 访问者模式.visitor.Visitor;

public class TravelCities implements City {
    City[] cities;

    public TravelCities() {
        cities = new City[]{new Beijing(),new Shanghai(),new Shenzhen()};
    }

    @Override
    public void accept(Visitor visitor) {
        for (int i = 0; i < cities.length; i++) {
            cities[i].accept(visitor);
        }
    }
}
