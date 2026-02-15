import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {
        // if
        // if else
        // if else if else...
        // switch case

        // if statement
        // if(condition) {

        // }

        int a = 9;

        // a is even or odd
        if(a % 2 != 0) {
            System.out.println("even");
        }

                    // operators
        // arithematic --> +, -, *, / , %
        // relational --> >,>=, <, <=, !=, ==
        // conditional --> &&, ||, !
        // unary operators --> ++, --
        int y = 9;
        float x = y * 1.0f / 2; // --> 9.0 / 2

        System.out.println(x); // -> int


        // if - else
        if(a > 0) {
            // body
            System.out.println("positive");
        }
        else {
            // else
            System.out.println("negative");
        }

        // if else if else
        // if elif elif elif else

        if(a > 0) {
            System.out.println("greater than 0 ");
        }
        else if(a < 0) {
            System.out.println("less than 0");
        }
        else {
            // a == 0
            System.out.println("equals 0");
        }

        // input marks from the user
        // grades
        // 90-100 --> Grade A
        // 70-89 --> Grade B
        // 60-69 --> Grade C
        // 50-59 --> Grade D
        // < 50  --> Fail
        // you cant enter anything below 0 and above 100

        // input
        Scanner in = new Scanner(System.in);
        int marks = in.nextInt();

        // if else statements
        if(marks < 0 || marks > 100) {
            System.out.println("Marks are invalid");
        }
        else if (marks <= 100 && marks >= 90){
            System.out.println("Grade A");
        }
        else if(marks < 90 && marks >= 70) {
            System.out.println("Grade B");
        }
        else if(marks < 70 && marks >= 60) {
            System.out.println("Grade C");
        }
        else if(marks < 60 && marks >= 50) {
            System.out.println("Grade D");
        }
        else {
            System.out.println("Failed");
        }


        System.out.println("Enter a number between 1 - 7");
        int n = in.nextInt();

        // cases
        switch(n) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Webnesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default :
                System.out.println("Invalid choice");
        }

        System.out.println("Calculator");

        System.out.println("Enter a character");
        char ch = in.next().charAt(0);

        System.out.println("ENter 2 integers");
        int num1 = in.nextInt();
        int b = in.nextInt();

        switch(ch) {
            case '+':
                System.out.println(num1 + b);
                break;
            case '-':
                System.out.println(num1 - b);
                break;
            case '*':
                System.out.println(num1 * b);
                break;
            case '/':
                if(b == 0) {
                    System.out.println("b cant be 0");
                    break;
                }
                System.out.println(num1 / b);
                break;
            case '%':
                if(b == 0) {
                    System.out.println("b cant be 0");
                    break;
                }
                System.out.println(num1 % b);
                break;
            default:
                System.out.println("Invalid choice");
        }

        System.out.println("At the END");
    }
}
