package creational.abstractFactory.factories;

import creational.abstractFactory.colors.Blue;
import creational.abstractFactory.colors.Color;
import creational.abstractFactory.colors.Green;
import creational.abstractFactory.colors.Red;
import creational.abstractFactory.shapes.Shape;

public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        switch (color) {
            case "green":
                return new Green();
            case "red":
                return new Red();
            case "blue":
                return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
