import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        
        // question is --> accept size from user --> n
        // and accept n numbers from user and store it in arrays
        // print only the even numbers from that given set of numbers

        // FLOW
        // i) accept a number --> size
        // ii) accept n numbers from the user
        // iii) iterate through that array
        // iv) and check if it is even or not

        Scanner in = new Scanner(System.in);
        System.out.println("Enter size");
        int size = in.nextInt();

        // initialisation of array
        int[] arr = new int[size];
        // double[] arr1 = new double[size];
        // String[] arr2 = new String[size];

        // store elements in array
        System.out.println("Enter " + size + " Numbers");
        for(int i = 0; i < size; i++) {
            int x = in.nextInt();
            arr[i] = x;
        }

        // evens from that array
        // 1) 2 ways

        // older / most common way of iterating through an array
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }

        for(int i : arr) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }

        // System.out.println(arr);

        // how to print -- iterate through the array and print one by one

        System.out.println("Printing arrays");
        for(int i= 0 ; i <arr.length; i++) {
            System.out.print(arr[i]);
        }

        System.out.println();
        
        for(int i : arr ){
            System.out.print(i);
        }


    }
}
