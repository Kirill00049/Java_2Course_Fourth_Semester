package pract6.Prototype;

public class Main {
    public static void main(String[] args) {
        ComplicatedObject prototype = new ComplicatedObject();
        ComplicatedObject clone = prototype.copy();
        clone.setType(ComplicatedObject.Type.ONE);
        clone.setType(ComplicatedObject.Type.TWO);
    }
}
