package com.example.concepts.composition.BirdExample;

public class CannotFly implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("Cannot fly");
    }
}
