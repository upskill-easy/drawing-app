package org.example.shape;

public class Triangle implements Shape{

    public Triangle(){
        System.out.println("Triangle constructor...");
    }
    @Override
    public void draw() {
        System.out.println("This is a triangle...");
    }
}
