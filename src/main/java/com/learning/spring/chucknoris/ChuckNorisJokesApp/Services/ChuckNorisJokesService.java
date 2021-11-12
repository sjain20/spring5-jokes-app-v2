package com.learning.spring.chucknoris.ChuckNorisJokesApp.Services;

import guru.springframework.norris.chuck.ChuckNorrisInfoContributor;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorisJokesService {

    ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorisJokesService() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    public  String getChuckNorisJokeFromService(){
        return chuckNorrisQuotes.getRandomQuote();
    }
}
