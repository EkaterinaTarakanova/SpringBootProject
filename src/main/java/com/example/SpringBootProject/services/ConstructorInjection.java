package com.example.SpringBootProject.services;


import com.example.SpringBootProject.entity.Animal;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;


@Log4j2
@Service
@RequiredArgsConstructor
public class ConstructorInjection {
    private final Animal dog;
    private final Animal cat;

    @PostConstruct
    private void init(){
        log.info("ConstructInjection is started");
    }

    @PreDestroy
    private void destroy(){
        log.info("ConstructInjection is destroyed");
    }

    private void animalMakeNoise(){
        cat.makeSound();
        dog.makeSound();
    }
}