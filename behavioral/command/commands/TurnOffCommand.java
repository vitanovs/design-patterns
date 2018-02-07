package behavioral.command.commands;

import behavioral.command.entities.TV;

public class TurnOffCommand implements Command {

    private TV tv;

    public TurnOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public boolean execute() {
        return this.tv.turnOff();
    }
}
