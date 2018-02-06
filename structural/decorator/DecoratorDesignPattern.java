package structural.decorator;

import structural.decorator.entities.HeavyArmourKit;
import structural.decorator.entities.HeavyAttackKit;
import structural.decorator.entities.Hero;
import structural.decorator.entities.SuperHero;

public class DecoratorDesignPattern {
    public static void main(String[] args) {
        Hero batman =
                new HeavyAttackKit(new HeavyArmourKit(new SuperHero("Batman", 25)));

        Hero robin =
                new HeavyArmourKit(new HeavyAttackKit(new SuperHero("Robin", 26)));

        Hero spiderMan
                = new HeavyAttackKit(new HeavyAttackKit(new SuperHero("Spider Man", 23)));

        System.out.println(batman);
        System.out.println();
        System.out.println(robin);
        System.out.println();
        System.out.println(spiderMan);
    }
}
