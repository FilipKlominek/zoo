package com.company;

import java.time.LocalDate;

public class Cat extends Animal {
    public Cat(String name, int weight, LocalDate birthDate, int lives) {
        super(name, weight, birthDate);
    }

    private int lives;

    public int getLives() {
        return lives;
    }

    public void fall() {
        this.lives--;
    }

    public boolean isAlive() {
        return this.lives > 0;
    }

    @Override
    public void speak() {
        System.out.println("meow");
    }
}
