package W6;

import java.util.*;

public class ArrayListQues1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();

        // accept elements until "exit"
        while (true) {
            String n = in.next();
            if (n.equals("exit")) {
                break;
            } else {
                int num = Integer.parseInt(n); // "10" --> 10
                arr.add(num);
            }
        }

        // print length
        System.out.println(arr.size());

        // accept one more elem
        System.out.println("Elem to be Searched");
        int n = in.nextInt();
        if (arr.contains(n)) {
            System.out.println("Present");
        } else {
            System.out.println("Not Present");
        }

        // remove
        System.out.println("Elem to be removed");
        n = in.nextInt();
        arr.remove((Integer) n);
    }
}
