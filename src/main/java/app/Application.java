package app;

import app.entities.Movie;
import app.repositories.MovieRepository;
import java.util.stream.Stream;
import java.util.Date;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner init(MovieRepository movieRepository) {
        return args -> {
            Stream.of("blutig", "the_crown", "blutig", "the_crown", "blutig", "the_crown", "blutig", "the_crown", "blutig", "the_crown", "wilde_tiere", "the_crown", "blutig", "the_crown", "paranormale_aktivitäten", "the_crown", "blutig", "the_crown", "blutig", "the_crown").forEach(name -> {
                Movie movie = new Movie(name, 5, new Date(), "Lol", "assets/img/Filme/" + name + "_f.jpg");
                movieRepository.save(movie);
            });
            movieRepository.findAll().forEach(System.out::println);
        };
    }
}