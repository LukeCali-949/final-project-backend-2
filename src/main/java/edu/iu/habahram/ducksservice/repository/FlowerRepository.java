package edu.iu.habahram.ducksservice.repository;

import edu.iu.habahram.ducksservice.model.Flower;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlowerRepository
        extends CrudRepository<Flower, Integer> {
}
