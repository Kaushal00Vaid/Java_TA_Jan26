package OPPE2;

import java.util.*;

// Define class SpeedLimitException
class SpeedLimitException extends Exception {
    SpeedLimitException(String msg) {
        super(msg);
    }
}

class Car {
    private String model;
    private double speed;

    public Car(String model) {
        this.model = model;
        this.speed = 0.0;
    }

    // Implement the method
    public void accelerate(double increment) throws SpeedLimitException {
        if (speed + increment > 120) {
            throw new SpeedLimitException("Speed limit exceeded, Max allowed is 120 km/h.");
        }

        speed = speed + increment;
    }

    public String toString() {
        return "Car Model: " + model + ", Speed: " + speed + " km/h";
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car myCar = new Car(sc.nextLine());
        try {
            myCar.accelerate(sc.nextDouble());
            myCar.accelerate(sc.nextDouble());
        } catch (SpeedLimitException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(myCar);
        sc.close();
    }
}
