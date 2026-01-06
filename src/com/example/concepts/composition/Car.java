package com.example.concepts.composition;

public class Car {

    private Engine engine; //HAS-A relationship

    public Car() {
        this.engine = new Engine();
    }

    void drive() {
        engine.start();
        System.out.println("Car is moving.");
    }
}
