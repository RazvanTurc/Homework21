package ro.fasttrackit.curs21homework.homework21.service;

import org.springframework.stereotype.Service;
import ro.fasttrackit.curs21homework.homework21.model.Actor;
import ro.fasttrackit.curs21homework.homework21.repository.ActorRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ActorService {

    private final ActorRepository repository;

    public ActorService(ActorRepository repository) {
        this.repository = repository;
    }

    public List<Actor> allActors() {
        return repository.findAll();
    }

    public Optional<Actor> getActor(int id) {
        return repository.findById(id);
    }

    public Actor saveActor(Actor actor) {
        return repository.save(actor);
    }
}
