package pract6.AbstractFactory;

import pract6.Factory.Circle;
import pract6.Factory.Factory;
import pract6.Factory.Rectangle;

public class CreateShape{

    Factory shape = null;
    public CreateShape (String type){
        switch (type) {
            case "Circle":
                shape = new Circle(5);
                break;
            case "Rectangle":
                shape = new Rectangle(3,4);
                break;
        }
        shape.square();
    }
}
