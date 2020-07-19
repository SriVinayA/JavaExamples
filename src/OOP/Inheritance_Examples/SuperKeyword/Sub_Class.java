package OOP.Inheritance_Examples.SuperKeyword;

class Super_Class {
    int age;

    Super_Class(int age) {
        this.age = age;
    }

    public void getAge() {
        System.out.println("The value of the variable named age in super class is: " +age);
    }
}

//Invoking Superclass Constructor
public class Sub_Class extends Super_Class {
    Sub_Class(int age) {
        super(age);
    }

    public static void main(String[] args) {
        Sub_Class s = new Sub_Class(24);
        s.getAge();
    }
}