package Abstraction_Examples;

class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(String color, double length, double width) {
        // calling Abstraction_Examples.Shape constructor
        super(color);
        System.out.println("Abstraction_Examples.Rectangle constructor called");
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length*width;
    }

    @Override
    public String toString() {
        return "Abstraction_Examples.Rectangle color is " + super.color + "and area is : " + area();
    }
}
