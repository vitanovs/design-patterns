package structural.decorator.entities;

public class SuperHero implements Hero {

    private String name;
    private int age;

    public SuperHero(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public int getHealth() {
        return 50;
    }

    @Override
    public int getStrength() {
        return 100;
    }

    @Override
    public int getArmour() {
        return 100;
    }


}
