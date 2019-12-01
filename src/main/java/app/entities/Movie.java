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
    private final String linkToWallpaper;
    
    public Movie() {
        this.name = "";
        this.rating = 0;
        this.linkToWallpaper = "";
    }
    
    public Movie(String name, int rating, String linkToWallpaper) {
        this.name = name;
        this.rating = rating;
        this.linkToWallpaper = linkToWallpaper;
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

    public String getLinkToWallpaper(){
        return linkToWallpaper;
    }
    
    @Override
    public String toString() {
        return "Movie{" + "id=" + id + ", name=" + name + ", rating=" + rating + '}';
    }
}