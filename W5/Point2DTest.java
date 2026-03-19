package W5;

import java.util.ArrayList;
import java.util.List;

class Point2D <T extends Number, U extends Number> {
    // 2 instance variables
    private T x1;
    private U x2;

    Point2D(T x, U y) {
        x1 = x;
        x2 = y;
    }

    // getters and setters
    public T getX1() {
        return x1;
    }
    public U getX2() {
        return x2;
    }

    public void setX1(T x) {
        x1 = x;
    }

    public void setX2(U x) {
        x2 = x;
    }


    // add() --> retuns x1 + x2
    public double add() {
        // double + double --> double
        return x1.doubleValue() + x2.doubleValue();
    }

}

public class Point2DTest {

    // ? --> anything but that should be a Number
    // Float, Integer, Double

    public void printArr(List<? extends Number> arr) {
        for(Object i : arr) {
            System.out.println(i);
        }
    }

    public static void print(List<? extends Number> arr) {
        for(Number i : arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Point2D<Integer, Integer> p1 = new Point2D<>(10, 20);

        Point2D<Integer, Float> p2 = new Point2D<>(20, 23.5f);

        // p1.setX2(30.98); // ERROR

        // int x = 34.56; // ERROR

        System.out.println(p1.add());
        System.out.println(p2.add());


        // -----------------------

        List<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(4);

        // array --> [2, 3, 4]

        // List<? extends Number> => List<Integer> --> Convariance is still not allowed
        print(arr);
    }
}
