package W3;

class Vehicle {
    String brand;
    String type;
    String numberPlate;

    Vehicle(String b, String t, String n) {
        brand = b;
        type = t;
        numberPlate = n;
    }

    void fuelType() {
        System.out.println("I am general thing. I can be either petrol / diesel / electric");
    }
}


class ElectricVehicle extends Test {
    String maxSpeed;

    ElectricVehicle(String b, String t, String n, String m) {
        super(b, t, n);
        maxSpeed = m;
    }

    void fuelType() {
        System.out.println("Electric");
    }

    // void func2() {
    //     System.out.println("This is in ElectricVehicle");
    // }
}

public class ElectricCar extends ElectricVehicle {
    String batteryCapacity;

    ElectricCar(String b, String t, String n, String m, String battery) {
        super(b, t, n, m); // all parent instance variable are initialised
        batteryCapacity = battery;
    }

    void fuelType() {
        System.out.println("This is called from Electric Car");
    }

    void func2() {
        System.out.println("This is in child class");
    }

    public static void main(String[] args) {
        ElectricCar elc = new ElectricCar("Toyota", "Bike", "JH052353", "90", "30");
         
        // // access brand
        // System.out.println(elc.brand);

        // elc.fuelType();

        ElectricVehicle ev = new ElectricCar("Hero", "Car", "JH052984", "100", "40");

        // ElectricCar ec = new ElectricVehicle();

        // ev.func2();

        // ev.func2();

        ElectricCar ec = (ElectricCar) ev;
        ec.func2();

        ev.fuelType(); // 

    }
}
