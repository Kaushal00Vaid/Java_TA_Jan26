public class FunctionOverloading {


    // area --> 1) circle, 2) rectangle, 3) square

    // circle
    static double area(double radius) {
        return 0.0;
    }

    // rectangle
    static double area(int length, int breadth) {
        return 0.0;
    }

    // square
    static double area(int side) {
        return 0.0;
    }


    public static void main(String[] args) {
        area(4, 5);
    }
}
