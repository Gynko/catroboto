package catrobots.springframework.catrobotsapp.repositories;

import org.springframework.data.repository.CrudRepository;
import catrobots.springframework.catrobotsapp.domain.CatNames;


public interface CatNamesRepository extends CrudRepository<CatNames, Long> {

}
