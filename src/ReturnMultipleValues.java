// POGO for grouping multiple fields
final class Person {
    public String name;
    public int age;
    public char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}

public class ReturnMultipleValues {
    public static Person getDetails() {
        // return person details from the method
        String name = "Ryan";
        int age = 25;
        char gender = 'M';

        return new Person(name, age, gender);
    }

    // Return multiple values from a method in Java
    public static void main(String[] args) {
        Person person = getDetails();

        System.out.println("Name is " + person.name);
        System.out.println("Age is " + person.age);
        System.out.println("Gender is " + person.gender);
    }
}