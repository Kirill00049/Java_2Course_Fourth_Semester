package pract6.Builder;

public class Product extends ConcreateBuilder{

    private ConcreateBuilder builder;
    public Product(ConcreateBuilder builder){
        this.builder = builder;
    }
}
