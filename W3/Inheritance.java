package W3;

class Person {
    // instance variables
    String name;
    int age;
    String pan;

    Person() {
        name = "";
        age = 10;
        pan = "";
    }

    Person(String name_, int age_) {
        name = name_;
        age = age_;
    }
}

public class Inheritance extends Person {

    String inst1;
    int inst2;

    Inheritance() {
        super(); // initialise the instance variables of the parent class
    }

    Inheritance(String name_, int age_) {
        super();
    }

    public void print() {
        System.out.println(super.age);
    }

    public static void main(String[] args) {
        Inheritance obj = new Inheritance();
    }
}
