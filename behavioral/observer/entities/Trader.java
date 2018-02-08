package behavioral.observer.entities;

public class Trader implements Observer {

    private static int totalTraders = 0;

    private Subject subject;
    private int traderId = ++totalTraders;

    private double appPrice;
    private double googPrice;
    private double ibmPrice;

    private double applDiff;
    private double googDiff;
    private double ibmDiff;

    public Trader(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void update(double applPrice, double googPrice, double ibmPrice) {
        calculateDifferences(applPrice, googPrice, ibmPrice);
        System.out.printf("Trader %d:\n" +
                        "APPl: %.2f [%s]\n" +
                        "GOOG: %.2f [%s]\n" +
                        "IBM: %.2f [%s]\n\n",
                this.traderId,
                applPrice, formatDifference(this.applDiff),
                googPrice, formatDifference(this.googDiff),
                ibmPrice, formatDifference(this.ibmDiff));

        this.appPrice = applPrice;
        this.googPrice = googPrice;
        this.ibmPrice = ibmPrice;
    }

    private String formatDifference(double difference) {
        if (difference < 0) {
            return String.format("-%.2f", Math.abs(difference));
        } else if (difference > 0) {
            return String.format("+%.2f", Math.abs(difference));
        } else {
            return String.format("%.2f", Math.abs(difference));
        }
    }

    private void calculateDifferences(double newApplPrice, double newGoogPrice, double newIbmPrice) {
        this.applDiff = getDiff(this.appPrice, newApplPrice);
        this.googDiff = getDiff(this.googPrice, newGoogPrice);
        this.ibmDiff = getDiff(this.ibmPrice, newIbmPrice);
    }

    private double getDiff(double oldPrice, double newPrice) {
        return newPrice - oldPrice;
    }
}
