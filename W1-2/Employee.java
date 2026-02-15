public class Employee {

    int id;
    String name;
    String[] department;

    

    // use constructors to initialise these variables
    // same name as class

    // constructor Overloading
    Employee() {
        id = 0;
        name = "kaushal";
        department = new String[]{"Dept1", "Dept2"};
    }

    Employee(int id, String name, String[] department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Copy Constructor
    Employee(Employee emp) {
        this.id = emp.id;
        this.name = emp.name;
        this.department = emp.department;
    }

    // function/method overloading
    static int add(int intN1, int intN2) {
        return intN1 + intN2;
    }

    static int add(int a, int b, int c) {
        return a + b;
    }

    static double add(int a, double b) {
        return a + b;
    }




    public static void main(String[] args) {
        String[] dep = new String[]{"A", "B"};

        Employee emp = new Employee(); // 1st
        Employee emp2 = new Employee(1, "Devam", dep); // 2nd
        Employee emp3 = new Employee(); // 1st
        System.out.println(emp.name);
        System.out.println(emp2.name);
        System.out.println(emp3.name);

        Employee emp4 = new Employee(emp2); // copy constructor

        add(1, 2);
        add(3, 4.0);
    }
}
