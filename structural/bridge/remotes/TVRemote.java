package structural.bridge.remotes;

import structural.bridge.devices.Media;

public class TVRemote extends Remote {

    public TVRemote(Media media) {
        super(media);
    }

    @Override
    public void buttonOnePressed() {
        super.media.buttonOnePressed();
    }

    @Override
    public void buttonTwoPressed() {
        super.media.buttonTwoPressed();
    }

    @Override
    public void buttonThreePressed() {
        super.media.buttonThreePressed();
    }

    @Override
    public void buttonFourPressed() {
        super.media.buttonFourPressed();
    }

    @Override
    public void buttonFivePressed() {
        super.media.buttonFivePressed();
    }

    @Override
    public void buttonSixPressed() {
        super.media.buttonSixPressed();
    }

    @Override
    public void status() {
        super.media.status();
    }
}
