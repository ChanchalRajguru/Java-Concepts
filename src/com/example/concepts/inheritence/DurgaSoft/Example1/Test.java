package com.example.concepts.inheritence.DurgaSoft.Example1;

public class Test {
    static void main(String[] args) {

        Parent parent = new Parent();
        parent.m1();
//        parent.m2();

        Child child = new Child();
        System.out.println("\nChild class methods = ");
        child.m2();
        child.m1();

        Parent parent1 = new Child();
        System.out.println("\nParent object Child reference =  ");
        parent1.m1();
//        parent1.m2();


//        Child child1 = new Parent();


    }
}
