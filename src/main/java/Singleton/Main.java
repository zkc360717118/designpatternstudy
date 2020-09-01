package Singleton;

public class Main {
    public static void main(String[] args) {
        //hungry version
//        Hungry c1 = Hungry.getInstance();
//        Hungry c2 = Hungry.getInstance();
//        System.out.println(c1 == c2);

        //lazy loading version
//        for (int i = 0; i < 100; i++) {
////            new Thread(()-> System.out.println(LazyLoading.getInstance())).start();
////        }

        //inner class (code is less ,looks good. but the logic looks that obvious )
//        for (int i = 0; i < 100; i++) {
//            new Thread(()-> System.out.println(InnerClass.getInstance())).start();
//        }

        //enum class (the best one so far,code is less and can prevent serializable attack)
        for (int i = 0; i < 1000; i++) {
            new Thread(()-> System.out.println(EnumSingleton.INSTANCE.getInstance())).start();
        }
    }
}
