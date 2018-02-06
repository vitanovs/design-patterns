package structural.composite.enities;

import java.util.ArrayList;
import java.util.List;

public class SongGroup extends SongComponent {

    List<SongComponent> songComponents;

    String groupName;
    String groupDescription;

    public SongGroup(String groupName, String groupDescription) {
        super();
        this.songComponents = new ArrayList<>();
        this.groupName = groupName;
        this.groupDescription = groupDescription;
    }

    @Override
    public void add(SongComponent component) {
        this.songComponents.add(component);
    }

    @Override
    public SongComponent getComponent(int componentIndex) {
        return this.getComponent(componentIndex);
    }

    @Override
    public String displaySongInfo() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("%s \n - %s\n",
                this.groupName,
                this.groupDescription));

        for (SongComponent component : songComponents) {
            String songInfo = component.displaySongInfo();
            builder.append(" *\t").append(songInfo).append("\n");
        }

        return builder.toString();
    }
}
