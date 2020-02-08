package com.jokeapp.spring5.spring5jokeapp.Controller;

import com.jokeapp.spring5.spring5jokeapp.Service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    @Autowired
    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService=jokeService;
    }

    @RequestMapping({"/",""})

    public String showJoke(Model model){
        model.addAttribute("joke",jokeService.getJoke());
        return "chucknorris";
    }
}
