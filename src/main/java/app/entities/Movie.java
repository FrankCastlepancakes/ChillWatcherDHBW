package app.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Movie {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private final String movieName;
    private final int movieRating;
    private Date movieReleaseDate;
    private String movieDesription;
    private final String linkToWallpaper;

    public Movie() {
        this.movieName = "";
        this.movieRating = 0;
        this.movieReleaseDate = new Date();
        this.movieDesription = "";
        this.linkToWallpaper = "";
    }
    
    public Movie(String movieName, int movieRating, Date movieReleaseDate, String movieDesription, String linkToWallpaper) {
        this.movieName = movieName;
        this.movieRating = movieRating;
        this.movieReleaseDate = movieReleaseDate;
        this.movieDesription = movieDesription;
        this.linkToWallpaper = linkToWallpaper;
    }

    public long getId() {
        return id;
    }
    
    public String getMovieName() {
        return movieName;
    }

    public int getMovieRating() {
        return movieRating;
    }

    public Date getMovieReleaseDate() {
        return movieReleaseDate;
    }

    public String getMovieDesription() {
        return movieDesription;
    }

    public String getLinkToWallpaper(){
        return linkToWallpaper;
    }
    
    @Override
    public String toString() {
        return "Movie{" + "id=" + id + ", name=" + movieName + ", rating=" + movieRating + '}';
    }
}