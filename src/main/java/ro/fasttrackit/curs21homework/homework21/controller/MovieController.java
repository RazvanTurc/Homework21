package ro.fasttrackit.curs21homework.homework21.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.fasttrackit.curs21homework.homework21.model.Movie;
import ro.fasttrackit.curs21homework.homework21.service.MovieService;

import java.util.List;

@RestController
@RequestMapping()
public class MovieController {
    private final MovieService service;

    public MovieController(MovieService service) {
        this.service = service;
    }

    @GetMapping("/movie")
    public List<Movie> getMovies() {
        return service.allMovies();
    }
}
