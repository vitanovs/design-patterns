package structural.bridge.devices;

public class TV extends Media {

    private int channel = 0;

    public TV(int volume, int maxVolume, int channel) {
        super(volume, maxVolume);
        this.channel = channel;
    }

    @Override
    public void buttonOnePressed() {
        super.power(true);
        super.response("TV is ON");
    }

    @Override
    public void buttonTwoPressed() {
        super.power(false);
        super.response("TV is OFF");
    }

    @Override
    public void buttonThreePressed() {
        if(super.isOn){
            super.initializeVolume(super.volume + 1);
            super.response("TV VOLUME " + super.volume);
        }
    }

    @Override
    public void buttonFourPressed() {
        if(super.isOn){
            super.initializeVolume(super.volume - 1);
            super.response("TV VOLUME " + super.volume);
        }
    }

    @Override
    public void buttonFivePressed() {
        if(super.isOn){
            this.channel++;
            super.response("TV CHANNEL " + this.channel);
        }
    }

    @Override
    public void buttonSixPressed() {
        if(super.isOn){
            this.channel--;
            super.response("TV CHANNEL " + this.channel);
        }
    }

    @Override
    public void status() {
        System.out.printf("TV: [%s], CHANNEL: %d, VOLUME %d\n",
                super.isOn ? "ON" : "OFF",
                this.channel,
                super.volume);
    }

}
