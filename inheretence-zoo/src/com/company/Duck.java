package com.company;

import java.time.LocalDate;

public class Duck extends Animal {
    public Duck(String name, int weight, LocalDate birthDate) {
        super(name, weight, birthDate);
    }

    public boolean canFly() {
        return getWeight() < 1600;
    }

    @Override
    public void speak() {
        System.out.println("quack");
    }
}
