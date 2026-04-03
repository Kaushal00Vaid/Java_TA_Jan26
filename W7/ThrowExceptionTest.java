package W7;

import java.util.*;

public class ThrowExceptionTest {
    public static boolean isNegative(int n) throws Exception {
        // i dont want to accept any negative number
        // throw a exception

        if (n < 0) {
            throw new Exception("I dont accept negatives");
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");

        int n = sc.nextInt();

        try {
            isNegative(n);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
