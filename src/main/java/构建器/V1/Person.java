package 构建器.V1;

/**
 * 创建一个“人类” ，如果是用构造方法的问题就在于，如果传给构造器的参数可能非常多，几百个，或者每次不一样，不确定。这样用构造器就很麻烦
 *
 */
public class Person {
    int id;
    String name;
    int age;
    double weight;
    int score;
    Location loc;

    /*
            静态内部类，为什么用静态内部类？
            1. 可以使用Person.PersonBuilder()
         */
    public  static class PersonBuilder {
        Person p = new Person();

        public Person build() {
            return p;
        }

        public PersonBuilder basicInfo(int id, String name, int age) {
            p.id = id;
            p.age = age;
            p.name = name;
            return this;
        }
        public PersonBuilder weight(double weight) {
            p.weight = weight;
            return this;
        }

        public PersonBuilder score(int score) {
            p.score = score;
            return this;
        }

        public PersonBuilder loc(String street, String roomNo) {
            p.loc = new Location(street, roomNo);
            return this;
        }
    }





}
