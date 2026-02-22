package W3;

class Person {
    private String name;
    private int age;

    Person(String name_, int age_) {
        name = name_;
        age = age_;
    }

    void printDetails() {
        System.out.println(name);
        System.out.println(age);
    }

    int add(int a) {
        return a + 10;
    }
}

public class Student extends Person{

    int rollNumber;

    // function overriding
    void printDetails() {
        // call the parent printDetails();
        // then you do your work
        super.printDetails(); // we call the function of parent class
        System.out.println(rollNumber);

    }


    Student(String n, int a, int roll ){
        super(n, a); // initialise name and age
        rollNumber = roll; // initialise your variables
    }

    public static void main(String[] args) {
        Student st = new Student("Kaushal", 20, 1);
        st.printDetails(); // parent's function
        st.add(10);
    }
}
