package org.example.shape;

public class Circle implements Shape {

    public int id = 1;

    public Circle() {
        System.out.println("Circle constructor...");
    }

    @Override
    public void draw() {
        System.out.println("This is a circle..");
    }
}
