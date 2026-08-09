package W8;

import java.util.*;

public class HOFTest {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(45);
        arr.add(20);
        arr.add(9);
        arr.add(100);

        System.out.println(arr);

        Collections.sort(arr);
        System.out.println(arr);

        Integer[] arr2 = { 45, 20, 9, 100 };

        Arrays.sort(arr2); // sorts in ascending order

        for (int i : arr2) {
            System.out.print(i + " ");
        }

        // descending order
        // Arrays.sort(arr2, new Comparator<Integer>() {
        // // compare method
        // @Override
        // public int compare(int a, int b) {
        // return a - b;
        // }
        // });

        String[] str = { "Apple", "banana", "cherry" };

        // sort in descending order of length
        Arrays.sort(str, new Comparator<String>() {
            public int compare(String a, String b) {
                return b.length() - a.length(); // 6 - 5 --> 1
            }
        });

        // lambda expressions
        Arrays.sort(str, (a, b) -> b.length() - a.length());

        for (String i : str) {
            System.out.println(i);
        }
    }
}
