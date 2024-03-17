package com.example.SpringBootProject.services;

import com.example.SpringBootProject.entity.Animal;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class SetterInjection {
    private Animal cat;
    private Animal dog;

    @PostConstruct
    private void init(){
        log.info("SetterInjection is started");
    }

    @PreDestroy
    private void destroy(){
        log.info("SetterInjection is destroyed");
    }
    @Autowired
    private void setDog(Animal dog){
        this.dog = dog;
    }

    @Autowired
    private void setCat(Animal cat){
        this.cat = cat;
    }

    private void animalMakeNoise(){
        cat.makeSound();
        dog.makeSound();
    }
}