package W8;

import java.util.*;

public class EmployeeTest implements Cloneable {

    // instance variables
    private String name;
    private double salary;
    private Date birthday;

    EmployeeTest(String name, double salary, Date birthday) {
        this.name = name;
        this.salary = salary;
        this.birthday = birthday;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setDate(int day, int month, int year) {
        this.birthday.setDate(day);
        this.birthday.setMonth(month);
        this.birthday.setYear(month);
    }

    public String toString() {
        return this.name + " " + this.salary + " " + this.birthday;
    }

    // override
    public EmployeeTest clone() throws CloneNotSupportedException {
        // return (EmployeeTest) super.clone(); // shallow copy

        // deep copy
        EmployeeTest newEmp = (EmployeeTest) super.clone();
        newEmp.birthday = (Date) birthday.clone();
        return newEmp;
    }

    public static void main(String[] args) {
        Date birthday = new Date(05, 3, 16);
        EmployeeTest emp1 = new EmployeeTest("Dhruv", 20000, birthday);

        try {
            EmployeeTest emp2 = emp1.clone();
            emp2.setName("EkNath");
            emp2.setDate(18, 4, 1997);
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(emp1);
    }
}