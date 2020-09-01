package Singleton;

class JDBC{

}

public enum  EnumSingleton {
    INSTANCE;

    private JDBC conn;
    EnumSingleton() {
        System.out.println("i am comming ........");
        conn = new JDBC();
    }

    public JDBC getInstance() {
        return conn;
    }
}
