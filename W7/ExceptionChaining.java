package W7;

public class ExceptionChaining {
    public static void main(String[] args) {
        try {
            try {
                System.out.println(10 / 0);
            } catch (ArithmeticException e) {
                Exception ex = new Exception("The nested try block");

                ArrayIndexOutOfBoundsException ex2 = new ArrayIndexOutOfBoundsException("wfkubui");

                ex.initCause(e);
                throw ex2;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }
}
