package app.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private final String name;
    private final int rating;
    
    public Movie() {
        this.name = "";
        this.rating = 0;
    }
    
    public Movie(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public long getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }
    
    @Override
    public String toString() {
        return "Movie{" + "id=" + id + ", name=" + name + ", rating=" + rating + '}';
    }
}