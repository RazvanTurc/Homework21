package ro.fasttrackit.curs21homework.homework21.service;

import org.springframework.stereotype.Service;
import ro.fasttrackit.curs21homework.homework21.model.Studio;
import ro.fasttrackit.curs21homework.homework21.repository.StudioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudioService {
    private final StudioRepository repository;

    public StudioService(StudioRepository repository) {
        this.repository = repository;
    }

    public List<Studio> allStudios() {
        return repository.findAll();
    }

    public Optional<Studio> getStudio(int id) {
        return repository.findById(id);
    }

    public Studio saveStudio(Studio studio) {
        return repository.save(studio);
    }

}
