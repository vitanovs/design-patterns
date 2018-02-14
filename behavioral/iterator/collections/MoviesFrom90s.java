package behavioral.iterator.collections;

import behavioral.iterator.entities.CustomIterator;
import behavioral.iterator.entities.Movie;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MoviesFrom90s implements CustomIterator<Movie> {

    private List<Movie> movies;

    public MoviesFrom90s() {
        this.movies = new ArrayList<>();
        addMovie("Jurassic Park", "John McTiernan", 1993);
        addMovie("Lethal Weapons 3", "Richard Donner", 1992);
        addMovie("Armageddon", "Michael Bay", 1998);
    }

    public void addMovie(String name, String producer, int releaseYear) {
        Movie movie = new Movie(name, producer, releaseYear);
        this.movies.add(movie);
    }

    @Override
    public Iterator<Movie> getIterator() {
        return this.movies.iterator();
    }
}
