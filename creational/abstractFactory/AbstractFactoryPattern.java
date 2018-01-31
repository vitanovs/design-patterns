package creational.abstractFactory;

import creational.abstractFactory.colors.Color;
import creational.abstractFactory.factories.AbstractFactory;
import creational.abstractFactory.factories.FactoryProducer;
import creational.abstractFactory.shapes.Shape;

/**
 *  --- Abstract Factory Design Pattern ---
 *
 * What the Abstract Factory Design Pattern does is creating a super-factory
 * that is used to create other factories, by passing a identification parameter.
 * An interface is responsible for creating factories of related objects without
 * explicitly specifying their classes.
 *
 */
public class AbstractFactoryPattern {
    public static void main(String[] args) {

        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        Color red = colorFactory.getColor("red");
        red.fill();


        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        Shape square = shapeFactory.getShape("square");
        square.draw();

    }
}
