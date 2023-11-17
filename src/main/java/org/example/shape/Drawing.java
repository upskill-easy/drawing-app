package org.example.shape;

public class Drawing {
    private Shape shape;
    private String colour;

    public Drawing(){}

    public Drawing(Shape shape){
        this.shape = shape;
    }

    public void paint(){
        shape.draw();
        System.out.println("Shape creatde with " + colour + " colour");
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }
}
