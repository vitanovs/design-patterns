package structural.decorator.entities;

import structural.decorator.HeroDecorator;

public class HeavyAttackKit extends HeroDecorator {

    private static final int STRENGTH_BONUS = 225;

    public HeavyAttackKit(Hero hero) {
        super(hero);
    }

    @Override
    public int getStrength() {
        return super.getStrength() + STRENGTH_BONUS;
    }

    @Override
    public String toString() {
        String result = String.format("%s - %d\nHEALTH: %d, ARMOUR: %d, STRENGTH: %d",
                super.getName(),
                super.getAge(),
                super.getHealth(),
                super.getArmour(),
                super.getStrength() + STRENGTH_BONUS);
        return result;
    }
}
