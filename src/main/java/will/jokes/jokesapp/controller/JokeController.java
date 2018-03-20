package will.jokes.jokesapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import will.jokes.jokesapp.service.JokeService;

@Controller
public class JokeController {
    private JokeService jokeService;

    @Autowired
    public JokeController(final JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String getJoke(final Model model) {
        model.addAttribute("joke", jokeService.getJoke());

        return "chucknorris";
    }
}
