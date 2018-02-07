package behavioral.command;

import behavioral.command.entities.Remote;
import behavioral.command.entities.SamsungRemote;
import behavioral.command.entities.SumsungTv;
import behavioral.command.entities.TV;
import behavioral.command.enums.CommandType;

public class CommandDesignPattern {
    public static void main(String[] args) {
        TV television = new SumsungTv(100, 50);
        Remote remote = new SamsungRemote(television);

        remote.execute(CommandType.TURN_ON);
        remote.execute(CommandType.VOLUME_UP);
        remote.execute(CommandType.VOLUME_UP);
        remote.execute(CommandType.VOLUME_UP);
        remote.execute(CommandType.VOLUME_UP);
        remote.execute(CommandType.CHANNEL_UP);
        remote.execute(CommandType.CHANNEL_UP);
        remote.execute(CommandType.CHANNEL_UP);
        System.out.println(television);

        remote.execute(CommandType.CHANNEL_DOWN);
        remote.execute(CommandType.VOLUME_DOWN);
        remote.execute(CommandType.TURN_OFF);
        System.out.println(television);

    }
}
