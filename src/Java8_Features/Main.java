package Java8_Features;

import java.util.*;
import java.lang.*;

// A class to represent a student.
class Student {
    int rollno;
    String name, address;

    // Constructor
    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    // Used to print student details in main()
    public String toString() {
        return this.rollno + " " + this.name + " " + this.address;
    }
}

// Used for sorting in ascending order of roll number
class Sortbyroll implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.rollno - o2.rollno;
    }
}

// Used for sorting in ascending order of roll name
class Sortbyname implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}

class Main {
    public static void main (String[] args) {
        ArrayList<Student> ar = new ArrayList<>();
        ar.add(new Student(111, "bbbb", "london"));
        ar.add(new Student(131, "aaaa", "nyc"));
        ar.add(new Student(121, "cccc", "jaipur"));

        System.out.println("Unsorted");
        for (Student student : ar)
            System.out.println(student);

        Collections.sort(ar, new Sortbyroll());

        System.out.println("\nSorted by rollno");
        for (Student student : ar)
            System.out.println(student);

        Collections.sort(ar, new Sortbyname());

        System.out.println("\nSorted by name");
        for (Student student : ar)
            System.out.println(student);
    }
}