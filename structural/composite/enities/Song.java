package structural.composite.enities;

public class Song extends SongComponent {

    private String songName;
    private String bandName;
    private int releaseYear;

    public Song(String songName, String bandName, int releaseYear) {
        this.songName = songName;
        this.bandName = bandName;
        this.releaseYear = releaseYear;
    }


    @Override
    public String getSongName() {
        return this.songName;
    }

    @Override
    public String getBandName() {
        return this.bandName;
    }

    @Override
    public String displaySongInfo() {
        StringBuilder builder = new StringBuilder();
        builder
                .append(this.songName)
                .append(" by ")
                .append(this.bandName)
                .append(" released in ")
                .append(this.releaseYear);

        return builder.toString();
    }
}
