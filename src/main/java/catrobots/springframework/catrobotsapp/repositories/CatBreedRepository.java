package catrobots.springframework.catrobotsapp.repositories;

import org.springframework.data.repository.CrudRepository;
import catrobots.springframework.catrobotsapp.domain.CatBreed;

public interface CatBreedRepository extends CrudRepository<CatBreed, Long> {
}
