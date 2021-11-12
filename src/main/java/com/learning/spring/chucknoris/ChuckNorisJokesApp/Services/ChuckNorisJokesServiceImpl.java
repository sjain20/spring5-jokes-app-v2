package com.learning.spring.chucknoris.ChuckNorisJokesApp.Services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorisJokesServiceImpl implements ChuckNorisJokesService {
    ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorisJokesServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getChuckNorisJokeFromService() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
