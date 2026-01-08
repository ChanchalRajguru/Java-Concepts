package com.example.concepts.composition.BirdExample;

public class Bird {

    private FlyBehaviour flyBehaviour;

    public Bird(FlyBehaviour flyBehaviour){
        this.flyBehaviour = flyBehaviour;
    }

    //fly behavior
    void performFly(){
        flyBehaviour.fly();
    }
}
