package ro.fasttrackit.curs21homework.homework21.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Movie {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int year;

    @OneToOne
    private MovieRating movieRating;
    @OneToMany
    private List<Review> review;
    @ManyToOne
    private Studio studio;
    @ManyToMany
    private List<Actor> actor;

    public Movie() {

    }

    public Movie(String name, int year, MovieRating movieRating, List<Review> review, Studio studio, List<Actor> actor) {
        this.name = name;
        this.year = year;
        this.movieRating = movieRating;
        this.review = review;
        this.studio = studio;
        this.actor = actor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Studio getStudio() {
        return studio;
    }

    public MovieRating getMovieRating() {
        return movieRating;
    }

    public List<Actor> getActor() {
        return actor;
    }

    public List<Review> getReview() {
        return review;
    }
}


