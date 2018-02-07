package behavioral.command.commands;

import behavioral.command.entities.TV;

public class ChannelDownCommand implements Command {
    private TV tv;

    public ChannelDownCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public boolean execute() {
        return this.tv.channelDown();
    }
}
