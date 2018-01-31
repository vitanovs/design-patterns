package creational.prototype.entities;

public class Peter implements Person{
    @Override
    public Person clone() {
        return new Peter();
    }

    @Override
    public String greet() {
        return "Hi, I am Peter";
    }
}
