package W7;

class ABCException extends Exception {
    ABCException() {
        super();
    }

    ABCException(String msg) {
        super();
        System.out.println("Exception in my Custom Exception: " + msg);
    }
}

public class CreatingExc {
    public static void main(String[] args) {
        try {
            throw new ABCException("wkufbu");
        } catch (ABCException e) {
            System.out.println("Some random Exception");
        } catch (Exception e) {
            System.out.println("wlsfubioab");
        }
    }
}
