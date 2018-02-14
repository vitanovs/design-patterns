package behavioral.iterator;

import behavioral.iterator.collections.MoviesFrom00s;
import behavioral.iterator.collections.MoviesFrom10s;
import behavioral.iterator.collections.MoviesFrom90s;
import behavioral.iterator.entities.Library;
import behavioral.iterator.entities.Movie;

public class IteratorDesignPattern {
    public static void main(String[] args) {
        MoviesFrom90s moviesFrom90s = new MoviesFrom90s();
        MoviesFrom10s moviesFrom10s = new MoviesFrom10s();
        MoviesFrom00s moviesFrom00s = new MoviesFrom00s();

        Library<Movie> movieLibrary = new Library<>(moviesFrom90s, moviesFrom00s, moviesFrom10s);

        movieLibrary.showContent();

    }
}
