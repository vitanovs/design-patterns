package behavioral.command.entities;

import behavioral.command.enums.CommandType;

public interface Remote {

    boolean execute(CommandType commandType);

}
