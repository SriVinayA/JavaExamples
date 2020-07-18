package Java8_Features;

import java.util.*;

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
    @Override
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

class ComparatorInterface_Example1 {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student(111, "bbbb", "london"));
        studentArrayList.add(new Student(131, "aaaa", "nyc"));
        studentArrayList.add(new Student(121, "cccc", "jaipur"));

        System.out.println("Unsorted");
        for (Student student : studentArrayList)
            System.out.println(student);

        studentArrayList.sort(new Sortbyroll());

        System.out.println("\nSorted by rollno");
        for (Student student : studentArrayList)
            System.out.println(student);

        studentArrayList.sort(new Sortbyname());

        System.out.println("\nSorted by name");
        for (Student student : studentArrayList)
            System.out.println(student);
    }
}