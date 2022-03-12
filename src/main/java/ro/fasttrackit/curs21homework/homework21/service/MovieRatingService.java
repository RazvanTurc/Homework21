package ro.fasttrackit.curs21homework.homework21.service;

import org.springframework.stereotype.Service;
import ro.fasttrackit.curs21homework.homework21.model.MovieRating;
import ro.fasttrackit.curs21homework.homework21.repository.MovieRatingRepository;

import java.util.List;

@Service
public class MovieRatingService {
    private final MovieRatingRepository repository;

    public MovieRatingService(MovieRatingRepository repository) {
        this.repository = repository;
    }

    public List<MovieRating> allRatings() {
        return repository.findAll();
    }

    public MovieRating saveRating(MovieRating rating) {
        return repository.save(rating);
    }
}
