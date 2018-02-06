package structural.decorator;

import structural.decorator.entities.Hero;


public abstract class HeroDecorator implements Hero {

    protected Hero hero;

    public HeroDecorator(Hero hero) {
        this.hero = hero;
    }

    @Override
    public String getName() {
        return this.hero.getName();
    }

    @Override
    public int getAge() {
        return this.hero.getAge();
    }

    @Override
    public int getHealth() {
        return this.hero.getHealth();
    }

    @Override
    public int getStrength() {
        return this.hero.getStrength();
    }

    @Override
    public int getArmour() {
        return this.hero.getArmour();
    }
}
