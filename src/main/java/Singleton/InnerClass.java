package Singleton;

public class InnerClass {
    private InnerClass(){}

    private static class InnerClassHolder{
        private static final InnerClass instance = new InnerClass();
    }

    public static InnerClass getInstance() {
        return InnerClassHolder.instance;
    }

    public void m() {
        System.out.println("i am one of the methods");
    }

}
