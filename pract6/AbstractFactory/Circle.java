package pract6.AbstractFactory;

import pract6.Factory.Factory;

public class Circle extends Factory {
    public int r;

    public Circle(int r){
        this.r = r;
    }
    @Override
    public void square() {
        System.out.println("Площадь круга = " + Math.PI * Math.pow(r,2));
    }
}
