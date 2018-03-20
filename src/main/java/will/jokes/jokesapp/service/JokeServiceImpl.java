package will.jokes.jokesapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {
    private final ChuckNorrisQuotes quoteGenerator;

    public JokeServiceImpl() {
        quoteGenerator = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return quoteGenerator.getRandomQuote();
    }
}
