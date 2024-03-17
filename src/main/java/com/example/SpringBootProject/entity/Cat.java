package com.example.SpringBootProject.entity;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class Cat implements Animal {
    @Override
    public void makeSound(){
        log.info("Мяу мяу");
    }
}