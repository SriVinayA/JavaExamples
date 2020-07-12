package Abstraction_Examples;

class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        // calling Abstraction_Examples.Shape constructor
        super(color);
        System.out.println("Abstraction_Examples.Circle constructor called");
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Abstraction_Examples.Circle color is " + super.color + "and area is : " + area();
    }
}
