package OPPE;

import java.util.*;

class AirPlane {
    private String model;

    public AirPlane(String n) {
        model = n;
    }

    // Define method display
    public void display() {
        System.out.println("Inside an anonymous airplane");
    }

    // Define an accessor method
    public String getModel() {
        return model;
    }
}

// Define class Boeing
class Boeing extends AirPlane {
    public Boeing(String model) {
        super(model);
    }

    // fn overriding
    public void display() {
        System.out.println("Inside Boeing " + super.getModel());
    }
}

// Define class Airbus
class AirBus extends AirPlane {
    public AirBus(String model) {
        super(model);
    }

    // fn overriding
    public void display() {
        System.out.println("Inside AirBus " + super.getModel());
    }
}

public class TestQ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AirPlane[] aPlanes = new AirPlane[3];
        aPlanes[0] = new AirPlane("");
        aPlanes[1] = new Boeing(sc.nextLine());
        aPlanes[2] = new AirBus(sc.nextLine());
        aPlanes[0].display();
        aPlanes[1].display();
        aPlanes[2].display();
        sc.close();
    }
}
