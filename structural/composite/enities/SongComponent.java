package structural.composite.enities;

public abstract class SongComponent {

    public void add(SongComponent component) {
        throw new UnsupportedOperationException();
    }

    public SongComponent getComponent(int componentIndex) {
        throw new UnsupportedOperationException();
    }

    public String getSongName() {
        throw new UnsupportedOperationException();
    }

    public String getBandName() {
        throw new UnsupportedOperationException();
    }

    public String displaySongInfo() {
        throw new UnsupportedOperationException();
    }

}
