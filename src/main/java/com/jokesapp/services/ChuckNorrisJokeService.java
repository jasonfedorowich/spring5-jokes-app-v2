package com.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"chuck", "default"})
public class ChuckNorrisJokeService implements JokeService{

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisJokeService(){
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    public String getRandomJoke(){
        return this.chuckNorrisQuotes.getRandomQuote();
    }
}
