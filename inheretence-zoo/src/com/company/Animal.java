package com.company;

import java.time.LocalDate;

public class Animal {


    public Animal(String name, int weight, LocalDate birthDate) {
        this.name = name;
        this.weight = weight;
        this.birthDate = birthDate;
    }

    private String name;
    private int weight;
    private LocalDate birthDate;

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void eat(int amount) {
        this.weight += amount;
    }

    public void unEat(int amount) {
        this.weight -= amount;
    }

    public void speak() {
        //magic happens
    }
}
