package app;

import app.repositories.MovieRepository;
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
            /*Stream.of("Blutig", "The Crown", "Blutig", "The Crown", "Blutig", "The Crown", "Blutig", "The Crown", "Blutig", "The Crown", "Blutig", "The Crown", "Blutig", "The Crown", "Blutig", "The Crown", "Blutig", "The Crown", "Blutig", "The Crown").forEach(name -> {
                Movie movie = new Movie(name, new Date(), "Lol", "", 0, 0, false);
                movieRepository.save(movie);
            });*/
            movieRepository.findAll().forEach(System.out::println);
        };
    }
}