package Prac_3;

public class Main {
    public static void main(String[] args) {
        SynchSet set = new SynchSet();
        Thread one = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                set.add(i);
            }
        });
    }
}
