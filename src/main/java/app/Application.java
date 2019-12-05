package app;

import app.entities.Movie;
import app.repositories.MovieRepository;
import java.util.stream.Stream;
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
            Stream.of("Joker", "Batman: The Dark Knight Rises", "8 mile", "Lincoln", "Robin Hood", "Mockingbird", "Peck is back", "Deadpool").forEach(name -> {
                Movie movie = new Movie(name, 5, "/assets/img/Filme/" + name + ".jpg");
                movieRepository.save(movie);
            });
            movieRepository.findAll().forEach(System.out::println);
        };
    }
}