package org.example;

import org.example.shape.Circle;
import org.example.shape.Drawing;
import org.example.shape.Shape;
import org.example.shape.Square;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context;
        context = new ClassPathXmlApplicationContext("spring.xml");
    }
}