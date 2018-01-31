package creational.abstractFactory.factories;

import creational.abstractFactory.colors.Color;
import creational.abstractFactory.shapes.Circle;
import creational.abstractFactory.shapes.Rectangle;
import creational.abstractFactory.shapes.Shape;
import creational.abstractFactory.shapes.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        switch (shape) {
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            case "rectangle":
                return new Rectangle();
        }
        return null;
    }
}
