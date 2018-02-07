package behavioral.command.commands;


import behavioral.command.entities.TV;

public class VolumeDownCommand implements Command{

    private TV tv;

    public VolumeDownCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public boolean execute() {
        return this.tv.volumeDown();
    }
}
