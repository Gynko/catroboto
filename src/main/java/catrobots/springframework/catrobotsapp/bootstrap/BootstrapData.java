package catrobots.springframework.catrobotsapp.bootstrap;

import catrobots.springframework.catrobotsapp.domain.CatBreed;
import catrobots.springframework.catrobotsapp.domain.CatNames;
import catrobots.springframework.catrobotsapp.repositories.CatBreedRepository;
import catrobots.springframework.catrobotsapp.repositories.CatNamesRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final CatBreedRepository catBreedRepository;
    private final CatNamesRepository catNamesRepository;

    public BootstrapData(CatBreedRepository catBreedRepository, CatNamesRepository catNamesRepository) {
        this.catBreedRepository = catBreedRepository;
        this.catNamesRepository = catNamesRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        CatNames george = new CatNames("George");
        CatNames bianca = new CatNames("Bianca");
        CatNames nils = new CatNames("Nils");
        catNamesRepository.save(george);
        catNamesRepository.save(bianca);
        catNamesRepository.save(nils);

        CatBreed sacre = new CatBreed("Sacre");
        catBreedRepository.save(sacre);

    }

}
