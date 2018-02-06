package structural.bridge;

import structural.bridge.devices.TV;
import structural.bridge.remotes.Remote;
import structural.bridge.remotes.TVRemote;

public class BridgeDesignPattern {
    public static void main(String[] args) {
        Remote tvRemote = new TVRemote(new TV(0, 100, 1));

        control(tvRemote);
    }

    private static void control(Remote remote){
        remote.buttonOnePressed();
        remote.buttonThreePressed();
        remote.buttonThreePressed();
        remote.buttonThreePressed();
        remote.buttonFivePressed();
        remote.buttonFivePressed();
        remote.buttonFivePressed();
        remote.buttonSixPressed();
        remote.status();
        remote.buttonTwoPressed();
    }
}
