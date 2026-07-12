package W4;

import java.util.*;

// class A {

// }

// class B {

// }

// // multiple inheritance
// class C extends A, B {

// }

// Define interface MarineSensor
interface MarineSensor {
    // void readData(int depth); // still a abstract method
    abstract void readData(int depth);

    default void defaultMethod(String str) {
        System.out.println(str);
    }
}

// public
// default
// protected
// private

// Define class SalinitySensor implementing MarineSensor
class SalinitySensor implements MarineSensor {
    public void readData(int data) {
        if (data > 1000) {
            System.out.println("Deep Sea Salinity: 35 ppt");
        } else {
            System.out.println("Surface Salinity: 32 ppt");
        }
    }

    public void defaultMethod(String str) {
        System.out.println("Hello");
    }
}

// Define class TemperatureSensor implementing MarineSensor
class TemperatureSensor implements MarineSensor {
    public void readData(int data) {
        if (data > 1000) {
            System.out.println("Deep Sea Temp: 4 Celsius");
        } else if (data > 200) {
            System.out.println("Twilight Zone Temp: 10 Celsius");
        } else {
            System.out.println("Surface Temp: 22 Celsius");
        }
    }
}

public class PlatformTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] depths = new int[n];
        for (int i = 0; i < n; i++) {
            depths[i] = sc.nextInt();
        }

        MarineSensor sSensor = new SalinitySensor();
        MarineSensor tSensor = new TemperatureSensor();

        for (int i = 0; i < n; i++) {
            System.out.println("Reading at depth: " + depths[i]);
            sSensor.readData(depths[i]);
            tSensor.readData(depths[i]);
            sSensor.defaultMethod("This is a default method call - sSensor");
            tSensor.defaultMethod("This is a default method call - tSensor");
        }
    }
}
