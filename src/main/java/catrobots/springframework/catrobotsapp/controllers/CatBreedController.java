package catrobots.springframework.catrobotsapp.controllers;

import catrobots.springframework.catrobotsapp.repositories.CatBreedRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CatBreedController {
    private final CatBreedRepository catBreedRepository;

    public CatBreedController(CatBreedRepository catBreedRepository) {
        this.catBreedRepository = catBreedRepository;
    }

    @RequestMapping("/catbreed")
    public String getCatBreed(Model model){

        model.addAttribute("catbreed", catBreedRepository.findAll());

        return "catbreed/list";
    }
}
