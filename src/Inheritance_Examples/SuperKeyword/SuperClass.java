package Inheritance_Examples.SuperKeyword;

public class SuperClass {
    int num = 20;

    public void display () {
        System.out.println("This is the display method of superclass");
    }

    public static void main(String[] args) {
        var obj = new SubClass();

    }
}