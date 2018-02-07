package behavioral.command.entities;

public class SumsungTv implements TV {

    private boolean isOn = false;
    private int volume;
    private int channel;

    private int maxVolume;
    private int maxChannel;

    public SumsungTv(int maxVolume, int maxChannel) {
        this.maxVolume = maxVolume;
        this.maxChannel = maxChannel;
    }

    @Override
    public boolean turnOn() {
        if (!this.isOn) {
            this.isOn = true;
            return true;
        }
        return false;
    }

    @Override
    public boolean turnOff() {
        if (this.isOn) {
            this.isOn = false;
            return true;
        }
        return false;
    }

    @Override
    public boolean volumeUp() {
        if (this.volume < this.maxVolume) {
            this.volume++;
            return true;
        }
        return false;
    }

    @Override
    public boolean volumeDown() {
        if (this.volume > 0) {
            this.volume--;
            return true;
        }
        return false;
    }

    @Override
    public boolean channelUp() {
        if (this.channel < this.maxChannel) {
            this.channel++;
            return true;
        }
        return false;
    }

    @Override
    public boolean channelDown() {
        if (this.channel > 0) {
            this.channel--;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("SamsungTV:\n")
                .append(" - IS ON: ").append(isOn ? "YES" : "NO").append("\n")
                .append(" - CHANNEL: ").append(this.channel).append("\n")
                .append(" - VOLUME: ").append(this.volume).append("\n");

        return builder.toString();
    }
}
