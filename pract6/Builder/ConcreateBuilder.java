package pract6.Builder;

public class ConcreateBuilder extends Builder{

    @Override
    public void buildPart1() {
        System.out.println("Первая часть собрана");
    }

    @Override
    public void buildPart2() {
        System.out.println("Вторая часть собрана");
    }
}
