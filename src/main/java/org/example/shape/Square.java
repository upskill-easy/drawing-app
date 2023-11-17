package org.example.shape;

public class Square implements Shape{

    public Square() {
        System.out.println("Square constructor...");
    }

    @Override
    public void draw(){
        System.out.println("This is a square..");
    }
}
