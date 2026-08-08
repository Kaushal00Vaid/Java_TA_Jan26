package Prac;

public class FuncOverloadingTest {

    // rectangle --> lb
    public static double area(double l, double b) {
        return l * b;
    }

    // circle --> 3.14 * r * r
    public static double area(double radius) {
        return 3.14 * radius * radius;
    }

    // square --> a * a
    public static double area(int a) {
        return a * a;
    }

    public static void main(String[] args) {
        System.out.println(area(3.8, 7.8));
    }
}
