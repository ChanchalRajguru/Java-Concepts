package com.example.concepts.composition.BirdExample;

public class CanFly implements FlyBehaviour{

    @Override
    public void fly() {
        System.out.println("Flying");
    }
}
