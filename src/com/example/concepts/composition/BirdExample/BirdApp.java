package com.example.concepts.composition.BirdExample;

public class BirdApp {
    static void main(String[] args) {
        Bird sparrow = new Bird(new CanFly());
        Bird ostrich = new Bird(new CannotFly());

        sparrow.performFly();
        ostrich.performFly();
    }
}
