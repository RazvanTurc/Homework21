package ro.fasttrackit.curs21homework.homework21;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.fasttrackit.curs21homework.homework21.model.*;
import ro.fasttrackit.curs21homework.homework21.repository.*;

import java.util.List;

@SpringBootApplication
public class Homework21Application {

	public static void main(String[] args) {
		SpringApplication.run(Homework21Application.class, args);
	}

	@Bean
	CommandLineRunner run(ActorRepository actorRepo,
						  MovieRatingRepository ratingRepo,
						  MovieRepository movieRepo,
						  ReviewRepository reviewRepo,
						  StudioRepository studioRepo) {
		return args -> {
			Actor keanu = actorRepo.save(new Actor("Keanu Reeves", 1964));
			Studio warnerBros = studioRepo.save(new Studio("Warner Bros", "Pe undeva in lume"));
			Studio summitEntertainment = studioRepo.save(new Studio("Summit Entertainment", "Tot pe undeva in lume"));

			movieRepo.saveAll(List.of(
					new Movie(
							"The Matrix", 1999,
							ratingRepo.save(new MovieRating(8.7f,"IMDb")),
							reviewRepo.saveAll(List.of(
									new Review("Fain","Giani de la LasFierbinti"),
									new Review("M-a scos din sevraj","Cetateanul Turmentat"))),
							warnerBros,
							List.of(keanu)
					))
			);
			movieRepo.saveAll(List.of(
					new Movie(
							"John Wick", 2014,
							ratingRepo.save(new MovieRating(7.4f,"IMDb")),
							reviewRepo.saveAll(List.of(new Review("Nota 11","Bobonete"))),
							summitEntertainment,
							List.of(keanu)
					))
			);

		};
	}
}
