package Prac_5;

public class Main {
    public static void main(String[] args) {
        Singleton singleton0 = Singleton.getInstance();
        Singleton singleton01 = Singleton.getInstance();
        System.out.println(singleton0);
        System.out.println(singleton01);

        Singleton1 singleton10 = Singleton1.getInstance();
        Singleton1 singleton11 = Singleton1.getInstance();
        System.out.println(singleton10);
        System.out.println(singleton11);

        Singleton2 singleton20 = Singleton2.getInstance();
        Singleton2 singleton21 = Singleton2.getInstance();
        System.out.println(singleton20);
        System.out.println(singleton21);
    }
}
