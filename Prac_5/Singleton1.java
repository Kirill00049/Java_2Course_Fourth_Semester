package Prac_5;
public class Singleton1 {
    private static Singleton1 INSTANCE;

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton1.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton1();
                }
            }
        }
        return INSTANCE;
    }
}
