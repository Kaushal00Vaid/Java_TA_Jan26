package W5;

class Point1D <T extends Number> {
    private T x; // Number x

    Point1D(T x) {
        this.x = x;
    }

    int add10() {
        return x.intValue() + 10; // int + int --> int
    }

    double multiple20() {
        return x.doubleValue() * 20;
    }

    // getters and setters
    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }
}

public class Point1DTest {
    public static void main(String[] args) {
        Point1D<String> p1 = new Point1D<>("20");

        // System.out.println(p1.getClass()); // Point1D

        Integer x = 10;

        // Number x2 = 20;

        // Object y = x + 5;

        x.intValue();

        System.out.println(p1.add10());
    }
}
