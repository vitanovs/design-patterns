package creational.abstractFactory.factories;

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        switch (choice) {
            case "shape":
                return new ShapeFactory();
            case "color":
                return new ColorFactory();
        }
        return null;
    }

}
