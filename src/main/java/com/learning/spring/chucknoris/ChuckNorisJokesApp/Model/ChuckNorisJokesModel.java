package com.learning.spring.chucknoris.ChuckNorisJokesApp.Model;

import com.learning.spring.chucknoris.ChuckNorisJokesApp.Services.ChuckNorisJokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckNorisJokesModel {

    ChuckNorisJokesService chuckNorisJokesService;

    public ChuckNorisJokesModel(ChuckNorisJokesService chuckNorisJokesService) {
        this.chuckNorisJokesService = chuckNorisJokesService;
    }

    @RequestMapping("/")
    public String getHomePageDisplay(Model model){
        return "Welcome";
    }
    @RequestMapping("/jokes")
    public String getJokes(Model model){
        model.addAttribute("jokes",chuckNorisJokesService.getChuckNorisJokeFromService());
        return "index";
    }
}
