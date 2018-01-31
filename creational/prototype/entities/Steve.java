package creational.prototype.entities;

public class Steve implements Person{
    @Override
    public Person clone() {
        return new Steve();
    }

    @Override
    public String greet() {
        return "Hi, I am Steve";
    }
}
