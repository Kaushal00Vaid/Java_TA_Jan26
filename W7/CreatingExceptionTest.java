package W7;

import java.util.*;

class CustomException extends Exception {
    // constructor
    CustomException() {
        super();
    }
}

public class CreatingExceptionTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Accepting a number");
        int n = in.nextInt();

        // if n == 5 --> throw a CustomException()

        try {
            if (n == 5) {
                throw new CustomException();
            }
        } catch (CustomException e) {
            System.out.println("I am handling my own Exception");
            // System.out.println(e.getMessage());
        }

    }
}
