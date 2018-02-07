package behavioral.command.commands;

import behavioral.command.entities.TV;

public class VolumeUpCommand implements Command {

    private TV tv;

    public VolumeUpCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public boolean execute() {
        return this.tv.volumeUp();
    }
}
