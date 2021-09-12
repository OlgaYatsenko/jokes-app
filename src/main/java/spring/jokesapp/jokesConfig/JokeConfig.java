package spring.jokesapp.jokesConfig;


import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Configuration
public class JokeConfig {

//    @Bean
    public ChuckNorrisQuotes getQuote(){ return new ChuckNorrisQuotes();}

}
