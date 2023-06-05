package Prac_5;

public class Singleton2 {

    private Singleton2() {
    }

    private static class SingletonHolder {
        public static final Singleton2 HOLDER_INSTANCE = new Singleton2();
    }

    public static Singleton2 getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
}
