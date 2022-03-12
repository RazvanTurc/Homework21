package ro.fasttrackit.curs21homework.homework21.service;

import org.springframework.stereotype.Service;
import ro.fasttrackit.curs21homework.homework21.model.Review;
import ro.fasttrackit.curs21homework.homework21.repository.ReviewRepository;

import java.util.List;

@Service
public class ReviewService {

    private final ReviewRepository repository;

    public ReviewService(ReviewRepository repository) {
        this.repository = repository;
    }

    public List<Review> allReviews() {
        return repository.findAll();
    }

    public Review saveReview(Review review) {
        return repository.save(review);
    }

    public List<Review> saveAllReviews(List<Review> reviews) {
        return repository.saveAll(reviews);
    }
}
