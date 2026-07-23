package W5;

// 1D point --> x - axis
class Point1D<T extends Number> {
    private T x;

    Point1D(T x) {
        this.x = x;
    }

}

public class PointTest {
    public static void main(String[] args) {
        Point1D<Integer> p1 = new Point1D<>(20);
        Point1D<Float> p2 = new Point1D<>(20.0f);
        Point1D<Double> p3 = new Point1D<>(20.0);

        // Point1D<String> p4 = new Point1D<>("Kaushal"); // Error

    }
}
