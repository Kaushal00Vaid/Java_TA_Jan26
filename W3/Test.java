package W3;

// parent class
class Vehicle {
    int maxSpeed;

    Vehicle(int max) {
        maxSpeed = max;
    }

    void fuelType() {
        System.out.println("I am from Vehicle class");
    }
}

class Bike extends Vehicle {

    Bike(int max) {
        super(max);
    }

    void TwoWheeler() {
        System.out.println("I am from Bike class");
    }
}

class Car extends Vehicle{
    String engineType;
    int maxSpeed; // this.maxSpeed --> Car
    // super.maxSpeed // super --> Parent class

    Car(int max, String eng) {
        super(max);
        engineType = eng;
        maxSpeed = 0;
    }

    void fuelType() {
        System.out.println("I am from Car");
    }

    void func2() {
        System.out.println("Func 2 from Car");
    }
    void func2(String n) {
        System.out.println("Parameterized Func 2 from Car");
    }
}

public class Test {
    public static void main(String[] args) {
        // Vehicle ob = new Vehicle(30);

        // Car c = new Car(50, "V12");

        // c.fuelType(); // Func 2 from Car

        // c.func2("ahsuifb"); // Parameterized Func 2 from Car

        // ob.fuelType(); // I am from Vehicle class

        // Vehicle v1 = new Car(70, "V11");

        // // v1.func2(); // how to fix this -- type cast to car

        // ((Car) v1).func2();

        // Car c2 = (Car) v1;
        // c2.func2();

        Vehicle[] vehicleArray = {
            new Car(80, "V10"),
            new Bike(120),
            new Car(90, "V9"),
            new Vehicle(120)
        };

        for(int i = 0; i < vehicleArray.length; i++) {
            Vehicle vh = vehicleArray[i];

            // Vehicle vh = new Car();

            // if it is Bike --> call TwoWheeler
            // if it is Car --> call fuelType
            // if it is Vehicle --> call fuelType

            // how to check types --> instanceof
            if(vh instanceof Bike) {
                ((Bike)vh).TwoWheeler();
                continue;
            }

            if(vh instanceof Car) {
                ((Car)vh).fuelType(); // better to do  -- good practice
                // vh.fuelType();
                continue;
            }

            
            if(vh instanceof Vehicle) {
                vh.fuelType();
                continue;
            }

            


        }


        for(int i = 0; i < 5; i ++) {
            if(i == 2) {
                continue;
            }
            System.out.println(i);
        }

        // 0, 1, 3, 4 --> this is in case of continue
        // 0, 1 --> break
    }
}
