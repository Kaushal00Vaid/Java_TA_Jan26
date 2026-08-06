package W7;

public class QuesCalcTest {

    public static int func(int a, int b, char ch) throws ArithmeticException, IllegalArgumentException {
        if (ch == '+') {
            return a + b;
        } else if (ch == '-') {
            return a - b;
        } else if (ch == '*') {
            return a * b;
        } else if (ch == '/') {
            if (b == 0) {
                throw new ArithmeticException("Cant divide by 0");
            }
            return a / b;
        } else {
            throw new IllegalArgumentException("Illegal Argument: " + ch);
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println(func(23, 0, 'K'));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
