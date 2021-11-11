package com.company;

import java.time.LocalDate;

public class Dog extends Animal {
    public Dog(String name, int weight, LocalDate birthDate, boolean hasCollar) {
        super(name, weight, birthDate);
    }

    private boolean collar;

    public boolean hasCollar() {
        return collar;
    }

    public void setCollar(boolean collar) {
        this.collar = collar;
    }

    @Override
    public void speak() {
        System.out.println("woof");
    }
}
