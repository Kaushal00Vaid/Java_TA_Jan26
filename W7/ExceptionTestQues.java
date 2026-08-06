package W7;

public class ExceptionTestQues {

    public static boolean isEligible(int age) throws Exception {
        if (age >= 18) {
            return true;
        } else {
            // thrown to whoever is calling me
            throw new Exception("owufg");
        }
    }

    public static void func() {
        try {
            if (isEligible(16)) {
                System.out.println("eloifg");
            }
        } catch (Exception e) {
            System.out.println("lqiwe");
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println(46 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occured");
        }

        int[] arr = new int[4];

        try {
            // System.out.println(46 / 0);
            System.out.println(arr[0]);

            System.out.println(arr[10]);
        } catch (NullPointerException e) {
            System.out.println("Null pointer Excep");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occured");
        } catch (Exception e) {
            System.out.println("Some exception occured");
        }

        try {
            System.out.println(isEligible(16));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("At the end");
    }
}