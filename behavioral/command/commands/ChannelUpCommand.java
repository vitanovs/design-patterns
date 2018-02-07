package behavioral.command.commands;

import behavioral.command.entities.TV;

public class ChannelUpCommand implements Command {

    private TV tv;

    public ChannelUpCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public boolean execute() {
        return this.tv.channelUp();
    }
}
