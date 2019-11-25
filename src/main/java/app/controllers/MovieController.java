package app.controllers;

import app.entities.Movie;
import app.repositories.MovieRepository;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin(origins = "http://pfobs.de")
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class MovieController {

    private final MovieRepository movieRepository;

    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping("/movies")
    public List<Movie> getMovies() {
        System.out.println(movieRepository.findAll());
        return (List<Movie>) movieRepository.findAll();
    }

    /*@PostMapping("/movies")
    void addMovie(@RequestBody Movie movie) {
        movieRepository.save(movie);
    }*/
}