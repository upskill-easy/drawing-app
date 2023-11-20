package org.example.shape;

public class Drawing {
    private Shape shape;

    private String colour;

    public Drawing(){
//        System.out.println("Drawing constructor 1");
    }

    public Drawing(Shape shape){
//        System.out.println("Drawing constructor 2");
        this.shape = shape;
    }

    public Drawing(String colour){
//        System.out.println("Drawing constructor 3");
        this.colour = colour;
    }
    public Drawing(Shape shape, String colour){
        this.shape = shape;
        this.colour = colour;
//        System.out.println("Drawing constructor 4");
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void paint(){
        shape.draw();
        System.out.println("Shape created with " + colour + " colour");
    }

    public void init(){
        System.out.println("Drawing init " + colour );
    }

    public void destroy(){
        System.out.println("Drawing destroy");
    }
}
