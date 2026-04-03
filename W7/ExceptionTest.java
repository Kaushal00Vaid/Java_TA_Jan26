package W7;

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("cant divide by 0");
        }

        int[] arr = new int[4];

        try {
            System.out.println(10 / 0); // ArithmeticException

            System.out.println(arr[0]);
            // System.out.println(arr[10]); // ISSUE
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of bound" + e);
        } catch (ArithmeticException e) {
            System.out.println("cant divide by 0");
        } catch (Exception e) {
            System.out.println("Some random exception occured");
        } finally {
            System.out.println("Finally is executed");
        }

        System.out.println("After finally");
    }
}