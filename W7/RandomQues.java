package W7;

import java.util.*;

public class RandomQues {
    public static boolean isEligibe(int n) throws Exception {
        if (n < 18) {
            throw new Exception("Not eligible");
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Accepting a number");
        int n = in.nextInt();
        try {
            if (n < 0) {
                throw new Exception("I dont accept negatives");
            }

            if (isEligibe(n)) {
                System.out.println("You can vote");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
