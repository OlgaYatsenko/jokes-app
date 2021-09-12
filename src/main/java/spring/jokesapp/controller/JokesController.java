package spring.jokesapp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.jokesapp.service.JokeService;

@Controller
@RequestMapping({"/",""})
public class JokesController {

    private final JokeService jokeService;

    public JokesController(JokeService jokeService) {
        this.jokeService =jokeService;
    }

    @GetMapping
    public String getIndexView(Model model){
        model.addAttribute("joke",jokeService.getJoke());
        return "index";
    }


}
