package prototype.V2;

/**
 * 深度克隆的处理
 */
public class Test {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person();
        Person p2 = (Person) p1.clone();
        System.out.println(p2.age + " " + p2.score);
        System.out.println(p2.loc);

        System.out.println(p1.loc == p2.loc); // true 说明指向同一个地址，这里就是潜拷贝
        p1.loc.street = "sh";
        System.out.println(p2.loc);



    }
}

class Person implements Cloneable {
    int age = 8;
    int score = 100;
    Location loc = new Location("bj", 233);

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person p = (Person)super.clone();
        p.loc = (Location) loc.clone(); //每一个类都要进行一次clone
        return p;
    }
}

class Location  implements Cloneable{
    String street;
    int roomNo;

    public Location(String street, int roomNo) {
        this.street = street;
        this.roomNo = roomNo;
    }

    @Override
    public String toString() {
        return "Location{" +
                "street='" + street + '\'' +
                ", roomNo=" + roomNo +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
