package OPPE;

import java.util.*;

class Rectangle<T extends Number> {
    private T length; // private Number length
    private T breadth;

    public Rectangle(T len, T bre) {
        length = len;
        breadth = bre;
    }

    // Define method public double area() here
    public double area() {
        return length.doubleValue() * breadth.doubleValue();
    }

    // Define method compareArea() here
    public double compareArea(Rectangle<?> rec) {
        double myOwnArea = area();
        double theSecArea = rec.area();

        // return myOwnArea > theSecArea ? myOwnArea : theSecArea;

        if (myOwnArea > theSecArea) {
            return myOwnArea;
        }
        return theSecArea;
    }

}

public class TestQ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle<Integer> r1 = new Rectangle<>(sc.nextInt(), sc.nextInt());
        Rectangle<Double> r2 = new Rectangle<>(sc.nextDouble(), sc.nextDouble());
        double large_area = r1.compareArea(r2);
        System.out.println(large_area);
    }
}
