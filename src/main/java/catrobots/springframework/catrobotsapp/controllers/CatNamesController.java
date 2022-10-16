package catrobots.springframework.catrobotsapp.controllers;


import catrobots.springframework.catrobotsapp.repositories.CatNamesRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
public class CatNamesController {
    private final CatNamesRepository catNamesRepository;

    public CatNamesController(CatNamesRepository catNamesRepository) {
        this.catNamesRepository = catNamesRepository;
    }

    @RequestMapping(value="/api/", method= RequestMethod.GET, produces="application/json")
    public String getNames(Model model){
        model.addAttribute(catNamesRepository.findAll());
        return "/catnames";
    }
}