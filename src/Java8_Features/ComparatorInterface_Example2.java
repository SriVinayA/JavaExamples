package Java8_Features;

import java.util.Comparator;

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" + "Name='" + name + '\'' + ", Age=" + age + '}';
    }
}

class CustomerSortingComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {

        // for comparison
        int NameCompare = o1.getName().compareTo(o2.getName());
        int AgeCompare = o1.getAge().compareTo(o2.getAge());
    }
}