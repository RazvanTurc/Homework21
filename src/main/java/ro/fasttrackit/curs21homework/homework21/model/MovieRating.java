package ro.fasttrackit.curs21homework.homework21.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MovieRating {
    @Id
    @GeneratedValue
    private int id;
    private float rating;
    private String agency;

    public MovieRating() {

    }

    public MovieRating(float rating, String agency) {
        this.rating = rating;
        this.agency = agency;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }
}
