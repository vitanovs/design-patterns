package behavioral.iterator.collections;

import behavioral.iterator.entities.CustomIterator;
import behavioral.iterator.entities.Movie;

import java.util.Arrays;
import java.util.Iterator;

public class MoviesFrom00s implements CustomIterator<Movie> {

    private Movie[] movies;
    private int index = 0;

    public MoviesFrom00s(){
        this.movies = new Movie[3];

        addMovie("Cloverfield", "Matt Reeves", 2008);
        addMovie("The Lord of the Rings: The Fellowship of the Ring",
                "Peter Jackson", 2001);
        addMovie("The Room", "Tommy Wiseau", 2003);
    }

    public void addMovie(String name, String producer, int releaseYear) {
        Movie movie = new Movie(name, producer, releaseYear);
        this.movies[this.index] = movie;
        this.index++;
    }

    @Override
    public Iterator<Movie> getIterator() {
        return Arrays.asList(this.movies).iterator();
    }
}
