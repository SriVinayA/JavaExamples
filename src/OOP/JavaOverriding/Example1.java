package OOP.JavaOverriding;

class Animal {
    public void move() {
        System.out.println("Animals can move");
    }
}

class Dog extends Animal {
    @Override
    public void move() {
        super.move();
        System.out.println("Dogs can walk and run");

    }
}

public class Example1 {
    public static void main(String[] args) {
        Animal b = new Dog(); // Animal reference but Dog object
        b.move(); // runs the method in Dog class
    }
}