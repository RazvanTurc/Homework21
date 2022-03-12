package ro.fasttrackit.curs21homework.homework21.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.fasttrackit.curs21homework.homework21.model.Studio;

@Repository
public interface StudioRepository extends JpaRepository<Studio, Integer> {
}
