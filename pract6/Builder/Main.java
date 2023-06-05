package pract6.Builder;

public class Main {
    public static void main(String[] args) {
        ConcreateBuilder builder = new ConcreateBuilder();
        Product o1 = new Product( builder);
        o1.buildPart1();
        o1.buildPart2();
    }
}
