package structural.bridge.remotes;

import structural.bridge.devices.Media;

public abstract class Remote {

    protected Media media;

    public Remote(Media media) {
        this.media = media;
    }

    public abstract void buttonOnePressed();

    public abstract void buttonTwoPressed();

    public abstract void buttonThreePressed();

    public abstract void buttonFourPressed();

    public abstract void buttonFivePressed();

    public abstract void buttonSixPressed();

    public abstract void status();

}
