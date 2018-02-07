package behavioral.command.entities;

import behavioral.command.commands.Command;
import behavioral.command.commands.CommandInterpreter;
import behavioral.command.enums.CommandType;

public class SamsungRemote implements Remote {

    private TV tv;

    public SamsungRemote(TV tv) {
        this.tv = tv;
    }

    @Override
    public boolean execute(CommandType commandType) {
        Command command = CommandInterpreter.interpred(commandType, this.tv);

        if (command != null) {
            return command.execute();
        } else {
            throw new UnsupportedOperationException();
        }
    }
}
