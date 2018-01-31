package creational.prototype.entities;

public class Tom implements Person{
    @Override
    public Person clone() {
        return new Tom();
    }

    @Override
    public String greet() {
        return "Hi, I am Tom";
    }
}
