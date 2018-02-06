package structural.composite;

import structural.composite.enities.Library;
import structural.composite.enities.Song;
import structural.composite.enities.SongComponent;
import structural.composite.enities.SongGroup;

public class CompositeDesignPattern {
    public static void main(String[] args) {

        SongComponent trapMusic = new SongGroup("Trap",
                "Trap music is based on use of the 808 Roland drum machine," +
                        " pitched and re-sampled hiphop/rap vocals," +
                        " pipe flutes, gangsta synth leads, and various FX");

        SongComponent trapSong1 = new Song("Act a fool", "Trap Nation", 2016);
        SongComponent trapSong2 = new Song("Revolution", "Diplo", 2014);

        trapMusic.add(trapSong1);
        trapMusic.add(trapSong2);

        SongComponent rnb = new SongGroup("R&B",
                "Contemporary R&B, also known as simply R&B, " +
                        "is a music genre that combines elements of pop," +
                        " rhythm and blues, soul, funk, hip hop, gospel and electronic dance music");

        SongComponent rnbSong1 = new Song("Starboy", "The Weekend", 2016);
        SongComponent rnbSong2 = new Song("Pony", "Giuwine", 1996);

        rnb.add(rnbSong1);
        rnb.add(rnbSong2);

        SongComponent newSong1 = new Song("Kiss", "Chris Brown", 2007);
        SongComponent newSong2 = new Song("What goes around, comes around",
                "Justin Timberlake", 2006);

        SongComponent everyComponent = new SongGroup("Every Song", " All songs");
        everyComponent.add(trapMusic);
        everyComponent.add(rnb);
        everyComponent.add(newSong1);
        everyComponent.add(newSong2);

        Library library = new Library(everyComponent);
        library.displayLibrary();

    }
}
