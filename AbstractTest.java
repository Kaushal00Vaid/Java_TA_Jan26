abstract class Car {
    boolean isSedan();
}

public class AbstractTest extends Car {
    public static void main(String[] args) {
        Car car = new AbstractTest();
        System.out.println(car.isSedan());
    }

    public boolean isSedan() {
        return false;
    }

    void setValue(){};
}