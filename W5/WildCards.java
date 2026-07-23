package W5;

import java.util.*;

class Animal {

}

class Cat extends Animal {

}

class Dog extends Animal {

}

public class WildCards {

    // public static <T> void printList(List<T> list) {
    // System.out.println(list);
    // }

    public static void printList(List<? extends Number> list) {
        for (Object i : list) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        List<Integer> listInt = new ArrayList<>();
        listInt.add(20);
        listInt.add(30);
        listInt.add(40);
        listInt.add(50);

        List<String> listStr = new ArrayList<>();
        listStr.add("Kaushal");
        listStr.add("Dhruv");
        listStr.add("Pulkit");
        listStr.add("Kshitij");

        List<Double> listDoub = new ArrayList<>();
        listInt.add(20);
        listInt.add(30);
        listInt.add(40);
        listInt.add(50);

        printList(listInt);
        printList(listStr);
        printList(listDoub);

        List<Animal> listAnim = new ArrayList<>();
        listAnim.add(new Animal());
        listAnim.add(new Cat());
        listAnim.add(new Dog());

        printList(listAnim);

    }
}
