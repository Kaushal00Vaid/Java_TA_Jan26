package W5;

class Calculator <T extends Number, U extends Number> {
    T num1;
    U num2;

    Calculator(T x, U y) {
        num1 = x;
        num2 = y;
    }

    // sum()
    public double sum() {
        return num1.doubleValue() + num2.doubleValue();
    }

    // multiply
    public double multiply() {
        return num1.doubleValue() * num2.doubleValue();
    }

    // power
    public double power() {
        return Math.pow(num1.doubleValue(), num2.doubleValue());
    }
}

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator<Integer, Float> c = new Calculator<>(2, 23.45f);

        c.sum();
        c.multiply();

        // Calculator<String, Float> c2 = new Calculator("Hello", 23.5f); // ERROR
    }
}
