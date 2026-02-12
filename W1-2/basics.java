import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        // print something -- output
        System.out.println("hello world");

        System.out.println("hellow" + "siufhg");

        // input from user
        // Scanner class

        // to create object
        // ClassName objName = new ClassName();
        Scanner in = new Scanner(System.in);
        int a = 10;
        a = 2389576; // here is the compiler
        // String a = a + "";

        // input an integer
        System.out.println("enter an integer");
        // a = input() -- next()
        // a = int(input()) --> nextInt()

        int input_int = in.nextInt();
        float x = in.nextFloat();
        double y = in.nextDouble();
        
        float f = x + 1.0f;

        // input
        System.out.println("enter a string");

        // next() -- single word
        // nextLine() -- sentence (multiple words)

        // float, double


        // String name = in.nextLine(); // inputs multiple words

        // print
        System.out.println(input_int);
        // System.out.println(name);

        System.out.println("I entered: " + input_int);

        
        
    }

    // class Basic:
        // def abc():
}
