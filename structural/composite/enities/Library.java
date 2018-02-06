package structural.composite.enities;

public class Library {

    private SongComponent components;

    public Library(SongComponent components) {
        this.components = components;
    }

    public void displayLibrary() {
        System.out.println(components.displaySongInfo());
    }
}
