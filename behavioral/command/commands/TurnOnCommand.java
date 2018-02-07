package behavioral.command.commands;

import behavioral.command.entities.TV;

public class TurnOnCommand implements Command {

    private TV tv;

    public TurnOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public boolean execute() {
        return this.tv.turnOn();
    }
}
