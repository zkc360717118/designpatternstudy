package Singleton;

/**
 * instance will be initialize when the class loaded into jvm
 */
public class Hungry {
    private static Hungry instance = new Hungry();

    // make sure the constructor is private to    prevent multiple new action
    private Hungry() {}

    public static Hungry getInstance(){
        if (instance == null) {
            instance = new Hungry();
        }

        return instance;
    }

}
