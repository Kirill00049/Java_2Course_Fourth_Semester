package pract8.Visitor;

public class Database implements ProjectElement{
    @Override
    public void beWritten(Visitor visitor) {
        visitor.create(this);
    }
}
