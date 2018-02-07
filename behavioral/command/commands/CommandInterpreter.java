package behavioral.command.commands;

import behavioral.command.entities.TV;
import behavioral.command.enums.CommandType;

public class CommandInterpreter {

    public static Command interpred(CommandType commandType, TV tv) {

        switch (commandType) {
            case TURN_ON:
                return new TurnOnCommand(tv);

            case TURN_OFF:
                return new TurnOffCommand(tv);

            case VOLUME_UP:
                return new VolumeUpCommand(tv);

            case VOLUME_DOWN:
                return new VolumeDownCommand(tv);

            case CHANNEL_UP:
                return new ChannelUpCommand(tv);

            case CHANNEL_DOWN:
                return new ChannelDownCommand(tv);

        }

        return null;
    }
}
