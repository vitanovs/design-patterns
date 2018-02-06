package structural.adapter;

public class WindBoatAdapter extends EngineBoat{

    private WindBoat windBoat;

    public  WindBoatAdapter(){
        this.windBoat = new WindBoat();
    }

    @Override
    public void run() {
        this.windBoat.sail();
    }
}
