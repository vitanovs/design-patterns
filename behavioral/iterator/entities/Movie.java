package behavioral.iterator.entities;

public class Movie {

    private String name;
    private String producer;
    private int releaseYear;

    public Movie(String name, String producer, int releaseYear) {
        this.name = name;
        this.producer = producer;
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return this.name + " by " + this.producer + " (" + this.releaseYear + ") ";
    }
}
