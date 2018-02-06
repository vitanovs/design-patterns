package structural.adapter;

public class AdapterDesignPattern {
    public static void main(String[] args) {

        Captain captain = new Captain(new WindBoatAdapter());
        captain.depart();

    }
}
