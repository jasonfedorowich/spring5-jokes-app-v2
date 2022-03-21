package com.jokesapp.controllers;

import com.jokesapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JokeRestController {

    @Autowired
    private final JokeService jokeService;

    public JokeRestController(JokeService jokeService){
        this.jokeService = jokeService;
    }

    @GetMapping("/random-joke")
    public String getRandomJoke(){
        return jokeService.getRandomJoke();
    }


}
