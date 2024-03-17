package com.example.SpringBootProject.services;

import com.example.SpringBootProject.entity.Animal;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class FieldInjection {
    @Autowired
    private Animal dog;
    @Autowired
    private Animal cat;

    @PostConstruct
    private void init(){
        log.info("FieldInjection is started");
    }

    @PreDestroy
    private void destroy(){
        log.info("FieldInjection is destroyed");
    }

    private void animalMakeNoise(){
        cat.makeSound();
        dog.makeSound();
    }
}