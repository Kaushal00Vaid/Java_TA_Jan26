package W6;

import java.util.*;

public class ArrayListTestBasics {
    public static void main(String[] args) {

        // declare an ArrayList
        ArrayList<Integer> arr = new ArrayList<>();

        // adding elements to arraylist
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        int[] intArr = { 20, 30, 40 };
        System.out.println(intArr);

        System.out.println(arr); // the toString method is alrady overridden

        // remove the elements
        arr.remove((Integer) 10); // using object (element)
        arr.remove(2); // through index (index 2)

        // [10, 20, 30, 40, 50]
        // [20, 30, 40, 50]
        // [20, 30, 50]
        System.out.println(arr);

        ArrayList<String> strArr = new ArrayList<>();
        strArr.add("Kaushal");
        strArr.add("Dhruv");
        strArr.add("Dhruv");
        strArr.add("Dhruv");
        strArr.add("Dhruv");
        strArr.add("Pulkit");

        strArr.remove(1); // removal at 1st occurance
        strArr.remove("Dhruv"); // removal at 1st occurance

        System.out.println(strArr);

        // how to search a element
        // 1) manual - linear search
        // 2) automatic - contains()

        // find is "Kshitij" in the arraylist
        // 1)
        for (String i : strArr) {
            if (i.equals("Kshitij")) {
                System.out.println("Present");
            }
        }

        // 2) contains() --> O(n)
        if (strArr.contains("Kshitij")) {
            System.out.println("Present");
        } else {
            System.out.println("Not present");
        }

        // FETCH THE ELEMENTS - get the element at this index
        System.out.println(strArr.get(1));

        // the length of the arraylist
        System.out.println(arr.size());
    }
}