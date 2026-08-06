package W7;

import java.util.Scanner;

class MyOwnException extends Exception {
    MyOwnException(String msg) {
        super(msg);
    }
}

public class RandomQ2 {

    public static void func2(int n) throws MyOwnException {
        if (n == 10) {
            throw new MyOwnException("Cant be 10");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.close();

        try {
            func2(n);
        } catch (MyOwnException e) {
            System.out.println(e.getMessage());
        }
    }
}
