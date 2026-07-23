package W5;

class Point2DXy<T extends Number, V extends Number> {
    private T x;
    private V y;

    // constructor
    Point2DXy(T x, V y) {
        this.x = x;
        this.y = y;
    }

    // getters and setters
    public T getX() {
        return x;
    }

    public V getY() {
        return y;
    }

    public void setX(T x_) {
        x = x_;
    }

    public void setY(V y_) {
        y = y_;
    }

    // add and subtract
    public double add() {
        // Number --> double
        return x.doubleValue() + y.doubleValue();
    }

    public double substract() {
        return x.doubleValue() - y.doubleValue();
    }

    public double div() {
        if (y.doubleValue() != 0) {
            return x.doubleValue() / y.doubleValue();
        }

        return Double.MIN_VALUE;
    }

    public double mult() {
        return x.doubleValue() * y.doubleValue();
    }

    public double pow() {
        return Math.pow(x.doubleValue(), y.doubleValue());
    }
}

public class Point2D {
    public static void main(String[] args) {
        Point2DXy<Integer, Integer> p1 = new Point2DXy<>(20, 30);

        Point2DXy<Integer, Double> p2 = new Point2DXy<>(20, 30.75);

        System.out.println((int) p1.add()); // 20 + 30 --> 50.0
        System.out.println(p2.add()); // 50.75

        int i = 10;
        char kuwgfro = 'c';
        String s = "s";
        String s2 = i + s;
        System.out.println("Hello world" + 1000 + "wkugwuo" + kuwgfro);
    }
}
