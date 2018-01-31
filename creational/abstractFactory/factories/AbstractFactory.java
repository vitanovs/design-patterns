package creational.abstractFactory.factories;

import creational.abstractFactory.colors.Color;
import creational.abstractFactory.shapes.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
