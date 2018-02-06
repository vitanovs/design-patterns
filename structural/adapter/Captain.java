package structural.adapter;

public class Captain {

    private EngineBoat boat;

    public Captain() {
    }

    public Captain(EngineBoat boat) {
        this.boat = boat;
    }

    public void depart() {
        boat.run();
    }
}
