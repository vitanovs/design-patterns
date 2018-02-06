package structural.bridge.devices;

public abstract class Media {

    protected boolean isOn;
    protected int maxVolume = 0;
    protected int volume = 0;

    public Media(int volume, int maxVolume) {
        this.initializeMaxVolume(maxVolume);
        this.initializeVolume(volume);
    }

    private void initializeMaxVolume(int maxVolume) {
        if (maxVolume < 0) {
            this.maxVolume = 0;
        } else {
            this.maxVolume = maxVolume;
        }
    }

    protected void initializeVolume(int volume) {
        this.volume = volume;
        if (this.volume > this.maxVolume) {
            this.volume = this.maxVolume;
        } else if (this.volume < 0) {
            this.volume = 0;
        }
    }

    public abstract void buttonOnePressed();

    public abstract void buttonTwoPressed();

    public abstract void buttonThreePressed();

    public abstract void buttonFourPressed();

    public abstract void buttonFivePressed();

    public abstract void buttonSixPressed();

    public abstract void status();

    protected void response(String response) {
        System.out.println(response);
    }

    protected boolean power(boolean isOn) {
        this.isOn = isOn;
        return true;
    }

}
