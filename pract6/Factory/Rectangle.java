package pract6.Factory;

public class Rectangle extends Factory{

    public int a;

    public int b;

    public Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }

    @Override
    public void square() {
        System.out.println("Площадь прямоугольника = " + a*b);
    }
}
