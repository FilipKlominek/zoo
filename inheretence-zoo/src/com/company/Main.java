package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Cat chonk = new Cat("Chonk", 10000, LocalDate.of(2016, 6, 24), 9);
        Dog doge = new Dog("Doge", 11000, LocalDate.of(2010, 2, 15), true);
        Duck joe = new Duck("Joe", 1500, LocalDate.of(2019, 9, 18));

        chonk.fall();
        boolean collar = doge.hasCollar();
        joe.canFly();
        joe.eat(200);
        joe.canFly();

        Animal[] animals = {chonk, doge, joe};
        for (int i = 0; i < animals.length; i++) {
            animals[i].speak();
        }
    }
}