package OPPE;

import java.util.*;

// DEFINE interface Computer
interface Computer {
    String compute();
}

// DEFINE interface PortableDevice
interface PortableDevice {
    String batteryBalance();
}

// DEFINE class Laptop
class Laptop implements Computer, PortableDevice {
    String model;

    // constructor
    Laptop(String n) {
        model = n;
    }

    public String compute() {
        return model + " computes";
    }

    public String batteryBalance() {
        return model + " is fully charged";
    }
}

public class TestQ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> messagesList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            String type = sc.next();
            if (type.equals("C")) {
                Computer c = new Laptop(sc.next());
                messagesList.add(c.compute());
            } else if (type.equals("M")) {
                PortableDevice m = new Laptop(sc.next());
                messagesList.add(m.batteryBalance());
            }
        }
        for (String s : messagesList) {
            System.out.println(s);
        }
        sc.close();
    }
}
