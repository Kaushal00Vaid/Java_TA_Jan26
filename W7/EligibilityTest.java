package W7;

import java.util.*;

// 2 exceptions
// 1 --> NotEligibleException
// 2 --> NegativeNumException

// Exception ob = new NotEligibleException();

class NotEligibleException extends Exception {
    NotEligibleException(String msg) {
        super(msg);
    }
}

class NegativeNumException extends Exception {
    NegativeNumException(String msg) {
        super(msg);
    }
}

public class EligibilityTest {
    public static boolean isEligibe(int n) throws NotEligibleException {
        if (n < 18) {
            throw new NotEligibleException("Not eligible");
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Accepting a number");
        int n = in.nextInt();
        try {
            if (n < 0) {
                throw new NegativeNumException("I dont accept negatives");
            }

            if (isEligibe(n)) {
                System.out.println("You can vote");
            }
        } catch (NotEligibleException e) {
            System.out.println(e.getMessage());
        } catch (NegativeNumException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // Runtime polymorphism
            // dynamic dispatch

            // Exception e = new NotEligibleException();
            // e.getMessage();
            System.out.println(e.getMessage());
        }
    }
}
