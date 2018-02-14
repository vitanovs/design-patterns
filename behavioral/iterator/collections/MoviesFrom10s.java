package behavioral.iterator.collections;

import behavioral.iterator.entities.CustomIterator;
import behavioral.iterator.entities.Movie;

import java.util.Hashtable;
import java.util.Iterator;

public class MoviesFrom10s implements CustomIterator<Movie> {

    private Hashtable<Integer, Movie> table;
    private int index = 0;

    public MoviesFrom10s() {
        this.table = new Hashtable<>();

        addMovie("Interstellar", "Christopher Nolan", 2014);
        addMovie("Mad Max: Fury Road", "George Miller", 2015);
        addMovie("Gravity", "Alfonso Cuaron", 2013);
    }

    public void addMovie(String name, String producer, int releaseYear) {
        Movie movie = new Movie(name, producer, releaseYear);
        table.put(this.index, movie);
        this.index++;
    }

    @Override
    public Iterator<Movie> getIterator() {
        return this.table.values().iterator();
    }
}
