package com.qindel.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OlympicGamesApplication {

    public static void main(String[] args) {
        SpringApplication.run(OlympicGamesApplication.class, args);
    }

}
