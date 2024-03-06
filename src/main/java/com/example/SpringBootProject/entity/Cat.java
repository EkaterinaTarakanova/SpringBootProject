package com.example.SpringBootProject.entity;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {
    @Override
    public void makeSound(){
        System.out.println("Мяу мяу");
    }
}