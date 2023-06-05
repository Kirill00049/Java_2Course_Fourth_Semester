package pract6.Factory;

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