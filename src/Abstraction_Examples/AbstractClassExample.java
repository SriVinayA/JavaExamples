package Abstraction_Examples;

abstract class Shape{
    String color;

    // these are abstract methods
    abstract double area();

    @Override
    public abstract String toString();

    public Shape(String color) {
        System.out.println("Abstraction_Examples.Shape constructor called");
        this.color = color;
    }

    // this is a concrete method
    public String getColor() {
        return color;
    }
}

public class AbstractClassExample {
}