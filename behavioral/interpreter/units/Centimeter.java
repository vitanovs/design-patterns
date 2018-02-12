package behavioral.interpreter.units;

public class Centimeter implements MetricUnit{
    @Override
    public double toMillimeters(double value) {
        return value * 10.0;
    }

    @Override
    public double toCentimeters(double value) {
        return value;
    }

    @Override
    public double toDecimeters(double value) {
        return value / 10.0;
    }

    @Override
    public double toMeters(double value) {
        return value / 100.0;
    }

    @Override
    public double toKilometers(double value) {
        return value / (double) (1000 * 100);
    }
}
