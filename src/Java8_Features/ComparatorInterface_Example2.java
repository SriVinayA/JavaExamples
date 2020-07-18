package Java8_Features;

import java.util.*;

class Student2 {
    String Name;
    int Age;

    public Student2(String name, Integer age) {
        Name = name;
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAge() {
        return Age;
    }

    @Override
    public String toString() {
        return "Student2{" + "Name='" + Name + '\'' + ", Age=" + Age + '}';
    }

    static class CustomerSortingComparator implements Comparator<Student2> {
        @Override
        public int compare(Student2 o1, Student2 o2) {

            // for comparison
            int NameCompare = o1.getName().compareTo(o2.getName());
            int AgeCompare = o1.getAge().compareTo(o2.getAge());

            // 2-level comparison using if-else block
            if (NameCompare == 0)
                return ((AgeCompare == 0) ? NameCompare : AgeCompare);
            else
                return NameCompare;
        }
    }

    public static void main(String[] args) {

        // create ArrayList to store Student2
        List<Student2> al = new ArrayList<>();

        // create customer objects using constructor initialization
        Student2 obj1 = new Student2("Ajay", 27);
        Student2 obj2 = new Student2("Sneha", 23);
        Student2 obj3 = new Student2("Simran", 37);
        Student2 obj4 = new Student2("Ajay", 22);
        Student2 obj5 = new Student2("Ajay", 29);
        Student2 obj6 = new Student2("Sneha", 22);

        // add customer objects to ArrayList
        al.add(obj1);
        al.add(obj2);
        al.add(obj3);
        al.add(obj4);
        al.add(obj5);
        al.add(obj6);

        // before Sorting arraylist: iterate using Iterator
        Iterator<Student2> custIterator = al.iterator();

        System.out.println("Before Sorting:\n");
        while (custIterator.hasNext()) {
            System.out.println(custIterator.next());
        }

        // sorting using Collections.sort(al, comparator);
        al.sort(new CustomerSortingComparator());

        // after Sorting arraylist: iterate using enhanced for-loop
        System.out.println("\n\nAfter Sorting:\n");
        for (Student2 customer : al) {
            System.out.println(customer);
        }
    }
}