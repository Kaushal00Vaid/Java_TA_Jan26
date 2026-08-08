package Prac;

import java.util.Scanner;

class Faculty {

    private String name;
    private double salary;

    public Faculty(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double bonus(float percent) {
        return (percent / 100.0) * salary;
    }

    // Define method getDetails()
    // public static/non-static returnType funcName(args){}
    public String getDetails() {
        return this.name + " " + this.salary;
    }

    public String getName() {
        return this.name;
    }

    // Overload method getDetails(float percent)
    public String getDetails(float p) {
        return this.name + " " + this.salary + " " + bonus(p);
    }
}

class Hod extends Faculty {
    private String personalAssistant;

    // Constructor for Hod
    public Hod(String name, double salary, String pA) {
        super(name, salary);
        personalAssistant = pA;
    }

    // Override method bonus(float percent)
    public double bonus(float percent) {
        return super.bonus(percent) * 0.5;
    }

    // Define method getDetails()
    public String getDetails() {
        return super.getDetails() + " " + this.personalAssistant;
    }

    // Overload method getDetails(float percent)
    public String getDetails(float p) {
        return getDetails() + " " + bonus(p);
    }

}

public class InheritanceTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Faculty obj1 = new Faculty(sc.next(), sc.nextDouble());
        Faculty obj2 = new Hod(sc.next(), sc.nextDouble(), sc.next());
        System.out.println(obj1.getDetails());
        System.out.println(obj1.getDetails(10));
        System.out.println(obj2.getDetails());
        System.out.println(obj2.getDetails(10));
    }
}