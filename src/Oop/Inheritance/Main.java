package Oop.Inheritance;

public class Main {
    public static void main(String[] args) {
        var control = new TextBox();
        control.clear();
        control.disable();
        System.out.println(control.isEnabled());
    }
}
