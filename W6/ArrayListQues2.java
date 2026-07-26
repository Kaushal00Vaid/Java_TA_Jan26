package W6;

import java.util.*;

class Employee {
    int id;
    String name;
    int salary;

    // constructors
    Employee(int id_, String name_, int salary_) {
        id = id_;
        name = name_;
        salary = salary_;
    }

    // toString Overriding
    public String toString() {
        // id + " " + name + " " + salary
        return id + " " + name + " " + salary;
    }
}

public class ArrayListQues2 {

    public static boolean search(ArrayList<Employee> arr, int idToBeSearched) {
        // for(int i = 0; i < arr.size(); i++) {
        // Employee curr = arr.get(i);
        // }

        for (Employee i : arr) {
            if (i.id == idToBeSearched) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // Task 1 --> Adding 5 elems to ..
        ArrayList<Employee> arr = new ArrayList<>();

        Employee emp1 = new Employee(1, "Emp1", 20000);

        arr.add(emp1);
        arr.add(new Employee(2, "Emp2", 450000));
        arr.add(new Employee(3, "Emp3", 90000));
        arr.add(new Employee(4, "Emp4", 80000));
        arr.add(new Employee(5, "Emp5", 23000));

        // Task 2 --> search by id
        if (search(arr, 3)) {
            System.out.println("Employee Found");
        } else {
            System.out.println("Employee Not Found");
        }

        // Task 3 --> inc salary by 10% for emp.salary < 50000
        for (Employee i : arr) {
            if (i.salary < 50000) {
                i.salary = i.salary + (int) (i.salary * 0.10);
            }
        }

        System.out.println("Increased salaries by 10%");

        // Task 4 --> remove emp.salary > 100k
        // for (Employee i : arr) {
        // if (i.salary > 100000) {
        // arr.remove(i); // ConcurrentModificationException
        // }
        // }

        // 1) --> Using Iterator
        // Iterator<Employee> it = arr.iterator();

        // while (it.hasNext()) {
        // Employee e = it.next();
        // if (e.salary > 100000) {
        // // arr.remove(e);
        // it.remove();
        // }
        // }

        // 2) trick --> iterate backward
        for (int i = arr.size() - 1; i >= 0; i--) {
            Employee currEmp = arr.get(i);
            if (currEmp.salary > 100000) {
                arr.remove(currEmp);
            }
        }

        System.out.println("Removal is done");

        for (Employee i : arr) {
            System.out.println(i);
        }
    }
}
