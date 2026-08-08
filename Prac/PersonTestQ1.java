package Prac;

import java.util.*;

class Person {
    private String name;
    private int age;
    private String PAN;
    private String[] friends;

    Person(String n, int a, String p, String[] fr) {
        if (a >= 18) {
            this.name = n;
            this.age = a;
            this.PAN = p;
            this.friends = fr;
        } else {
            System.out.println("For age " + a + " PAN is not allowed -- so setting it to \"\"");
            this.age = a;
            this.name = n;
            this.PAN = "";
            this.friends = fr;
        }
    }

    // copy constructor
    Person(Person ob) {
        this.name = ob.getName(); // ob.name;
        this.age = ob.getAge();
        this.PAN = ob.getPAN();

        // this.friends = ob.getFriends(); // SHALLOW COPY

        // DEEP COPY -- creating a new Object

        // 1) initialise the new memory location for the array
        friends = new String[ob.getFriends().length];

        // 2) copy elements one by one
        for (int i = 0; i < ob.getFriends().length; i++) {
            this.friends[i] = ob.getFriends()[i];
        }
    }

    // getters
    // syntax --> public dataType getName(){}

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getPAN() {
        return this.PAN;
    }

    public String[] getFriends() {
        return this.friends;
    }

    // setters
    // public void setName(String n){}

    public void setName(String n) {
        this.name = n;
    }

    public void setAge(int a) {
        this.age = a;
    }

    public void setPAN(String p) {
        if (this.age >= 18) {
            this.PAN = p;
        } else {
            System.out.println("Cant change PAN because age < 18");
        }
    }

    public void setFriends(String[] friends) {
        this.friends = friends;
    }

    public void setFriends(int idx, String newFriend) {
        this.friends[idx] = newFriend;
    }
}

public class PersonTestQ1 {
    public static void main(String[] args) {
        String[] fr = { "Fr1", "Fr2", "Fr3" };

        Person ob = new Person("Kaushal", 19, "KUSAFU8757L", fr);

        System.out.println(ob.getName());

        Person newOb = new Person(ob);
        System.out.println(newOb.getName());

        newOb.setName("Name23");
        System.out.println(newOb.getName());

        newOb.setFriends(1, "FrNew67");

        System.out.println("=========");

        for (String i : ob.getFriends()) {
            System.out.println(i);
        }

        System.out.println();

        for (String i : newOb.getFriends()) {
            System.out.println(i);
        }

        System.out.println("=========");
    }
}