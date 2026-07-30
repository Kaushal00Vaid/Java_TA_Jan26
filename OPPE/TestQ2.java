package OPPE;

import java.util.*;

// DEFINE abstract class Vehicle
abstract class Vehicle {
    String vehicleModel;

    Vehicle(String n) {
        vehicleModel = n;
    }

    abstract String computeMileage();
}

// DEFINE class Car
class Car extends Vehicle {
    Car(String n) {
        super(n); // calling the parent's constuctor
    }

    public String computeMileage() {
        return super.vehicleModel + " has a mileage of 20km/L";
    }
}

// DEFINE class Train
class Train extends Vehicle {
    Train(String n) {
        super(n); // calling the parent's constuctor
    }

    public String computeMileage() {
        return super.vehicleModel + " consumes 100L/hr";
    }
}

public class TestQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> messagesList = new ArrayList<>();
        int numVehicles = sc.nextInt();

        for (int i = 0; i < numVehicles; i++) {
            String type = sc.next();

            if (type.equals("C")) {
                Vehicle n = new Car(sc.nextLine().trim());
                messagesList.add(n.computeMileage());
            } else if (type.equals("T")) {
                Vehicle s = new Train(sc.nextLine().trim());
                messagesList.add(s.computeMileage());
            }
        }

        for (String s : messagesList) {
            System.out.println(s);
        }

        sc.close();
    }
}
