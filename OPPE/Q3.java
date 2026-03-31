package OPPE;

import java.util.*;

interface Registerable {
    public abstract String register();
}

class Department {
    String name;

    public Department(String n) {
        name = n;
    }

    private class DeptEnquiry implements Registerable {
        int reqseats; // requested seats
        int avalseats; // available seats

        public DeptEnquiry(int s) {
            reqseats = s;
            avalseats = 5; // i have 5 available seats
        }

        public String register() {
            if (avalseats < reqseats)
                return "Cannot register";
            else {
                avalseats = avalseats - reqseats;
                return "Registered successfully available seats are " + avalseats;
            }
        }
    }

    // ****** Define the method enrollRequest() here
    public Registerable enrollRequest(int n) {
        // return a object
        // ClassName objName = new ClassName(args);

        Registerable ob = new DeptEnquiry(n);
        return ob;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Department d1 = new Department("DCSE");
        Registerable r1 = d1.enrollRequest(sc.nextInt());
        System.out.println(r1.register());
    }
}