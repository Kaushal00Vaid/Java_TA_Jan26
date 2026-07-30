package OPPE;

import java.util.*;

class Customer {
    String name;
    String[] items;

    // ***** Define required constructor(s) here
    public Customer(String name, String[] arr) {
        this.name = name;
        this.items = arr;
    }

    // copy constructor
    public Customer(Customer c) {
        this.name = c.name; // c1.name
        // this.items = c.items; // c1.items - SHALLOW COPY

        // declare
        this.items = new String[c.items.length];

        int idx = 0;
        // iterate the array and store one by one
        for (String i : c.items) {
            items[idx] = i;
            idx++;
        }
    }

    public void setName(String n) {
        name = n;
    }

    public void setItem(int index, String itm) {
        items[index] = itm;
    }

    public String getName() {
        return name;
    }

    public String getItem(int indx) {
        return items[indx];
    }
}

// Order Class
public class TestQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] itms = { "Eggs", "Noodles", "Bread" };
        Customer c1 = new Customer("c1", itms);
        Customer c2 = new Customer(c1);
        c2.setName(sc.next());
        c2.setItem(1, sc.next());
        System.out.println(c1.getName() + ": " + c1.getItem(1));
        System.out.println(c2.getName() + ": " + c2.getItem(1));
    }
}
