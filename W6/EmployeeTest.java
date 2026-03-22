package W6;
import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    // constructor --> initialise the ins. var
    Employee(int _id, String n, double _s) {
        id = _id;
        name = n;
        salary = _s;
    }

    public String toString() {
        return id + " " + name + " " + salary;
    }
}

public class EmployeeTest {

    public static boolean search(ArrayList<Employee> empArr, int id) {
        for(Employee i : empArr) {
            if(i.id == id) {
                return true;
            }
        }

        // empArr.contains(id); // ERROR

        return false;
    }

    public static void main(String[] args) {
        // create arrayList of Employees
        ArrayList<Employee> empArr = new ArrayList<>();

        // adding 5 employees
        empArr.add(new Employee(101, "Emp1", 20000));
        empArr.add(new Employee(102, "Emp2", 450000));
        empArr.add(new Employee(103, "Emp3", 95000));
        empArr.add(new Employee(104, "Emp4", 80000));
        empArr.add(new Employee(105, "Emp5", 23000));

        // 1) search an employee with the given id
        search(empArr, 103);

        // 2) inc salary by 10% for emp having salary < 50k
        for(Employee i : empArr) {
            if(i.salary < 50000) {
                i.salary = i.salary + (i.salary*0.1);
            }
        }

        // 3) remove emp with salary > 100k

        // for(Employee i : empArr) {
        //     if(i.salary > 100000) {
        //         empArr.remove(i); // ConcurrentModificationException
        //     }
        // }


        // i) --> use Iterators
        // Iterator<Employee> it = empArr.iterator();

        // each iterator has 2 methods --> hasNext(), next()
        // while(it.hasNext()) {
        //     Employee e = it.next();
        //     if(e.salary > 100000) {
        //         it.remove();
        //     }
        // }

        // ii) --> TRICK --> iterate backwards and remove
        for(int i = empArr.size() - 1; i >= 0; i--) {
            // get employee at the current idx
            Employee e = empArr.get(i);

            if(e.salary > 100000) {
                empArr.remove(e);
            }
        }

        for(Employee i : empArr) {
            System.out.println(i);
        }
    }
}
