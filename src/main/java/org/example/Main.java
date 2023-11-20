package org.example;

import org.example.counter.Counter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context;
        context = new ClassPathXmlApplicationContext("app.xml");

        Counter counter1 = context.getBean("counter1", Counter.class);
        System.out.println("Counter 1 = " + counter1.getCount()); // Counter 1 = 1
        counter1.setCount(10);

        Counter counter2 = context.getBean("counter1", Counter.class);
        System.out.println("Counter 2 = " + counter1.getCount()); // Counter 2 =
    }
}