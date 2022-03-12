package ro.fasttrackit.curs21homework.homework21.service;

import org.springframework.stereotype.Service;
import ro.fasttrackit.curs21homework.homework21.model.Movie;
import ro.fasttrackit.curs21homework.homework21.repository.MovieRepository;

import java.util.List;

@Service
public class MovieService {
    private final MovieRepository repository;

    public MovieService(MovieRepository repository) {
        this.repository = repository;
    }

    public List<Movie> allMovies() {
        return repository.findAll();
    }
}
