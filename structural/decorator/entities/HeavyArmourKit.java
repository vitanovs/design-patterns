package structural.decorator.entities;

import structural.decorator.HeroDecorator;

public class HeavyArmourKit extends HeroDecorator{

    private static final int HEATH_BONUS = 125;
    private static final int ARMOUR_BONUS = 175;


    public HeavyArmourKit(Hero hero) {
        super(hero);
    }

    @Override
    public int getHealth() {
        return super.getHealth() + HEATH_BONUS;
    }

    @Override
    public int getArmour() {
        return super.getArmour() + ARMOUR_BONUS;
    }

    @Override
    public String toString() {
        String result = String.format("%s - %d\nHEALTH: %d, ARMOUR: %d, STRENGTH: %d",
                super.getName(),
                super.getAge(),
                super.getHealth() + HEATH_BONUS,
                super.getArmour() + ARMOUR_BONUS,
                super.getStrength());
        return result;
    }

}
