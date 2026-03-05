package W4;

abstract class Person {
    private String name;
    private int age;
    static int total = 0;

    Person(String name_, int age_) {
        name = name_;
        age = age_;
        total++;
    }

    // getters
    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int a) {
        age = a;
    }

    // abstract methods
    abstract void printDetails();

    void greet() {
        System.out.println("Hi my name is : " + name);
    }

    void showAge() {
        System.out.println("My Age is " +age);
    }

    static void showTotalPersons() {
        System.out.println("Total is : " + total);
    }
}

class Student extends Person {
    int rollNo;
    String[] friends;

    Student(String name_, int age_, int roll_, String[] friends) {
        super(name_, age_);
        rollNo = roll_;
        this.friends = friends;
    }

    Student(Student s) {
        super(s.getName(), s.getAge());
        rollNo = s.rollNo;

        // DEEP COPY
        friends = new String[s.friends.length];

        for(int i = 0; i < friends.length; i++) {
            friends[i] = s.friends[i];
        }
    }

    void study() {
        System.out.println("I am studying");
    }

    void study(int hours) {
        System.out.println("I am studying for " + hours + " hours");
    }

    void printDetails() {
        System.out.println("Student name: " + getName());
        System.out.println("Student age: " + getAge());
        System.out.println("Student roll: " + rollNo);
        System.out.println("Friends are: ");

        for(String i : friends) {
            System.out.println(i);
        }
    }
}

public class StudentTest {
    public static void main(String[] args) {
        String[] fr = new String[]{"F1", "F2", "F3"};

        Student s1 = new Student("Rahul", 20, 101, fr);

        s1.greet();
        s1.printDetails();

        s1.study();
        s1.study(5);

        System.out.println();

        Student s2 = new Student(s1);

        s2.friends[1] = "F10";

        s2.printDetails();

        System.out.println();

        s1.printDetails();

        Person.showTotalPersons();
    }
}
