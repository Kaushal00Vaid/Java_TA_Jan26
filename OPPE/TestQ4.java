package OPPE;

import java.util.*;

abstract class Staff {
    private String name;
    private String duty;
    private int num;

    public Staff(String name, String duty, int num) {
        this.name = name;
        this.duty = duty;
        this.num = num;
    }

    public String getDuty() {
        return duty;
    }

    public int getNum() {
        return num;
    }

    public String toString() {
        return name;
    }

    abstract String remuneration();
}

class Faculty extends Staff {
    public Faculty(String name, String duty, int num) {
        super(name, duty, num);
    }

    public String remuneration() {
        if (getDuty().equals("Invigilation"))
            return getNum() * 150 + "";
        else
            return "Wrong duty assigned";
    }
}

class Hod extends Staff {
    public Hod(String name, String duty, int num) {
        super(name, duty, num);
    }

    public String remuneration() {
        if (getDuty().equals("Squad"))
            return getNum() * 500 + "";
        else
            return "Wrong duty assigned";
    }
}

public class TestQ4 {
    // ****** Define method printStaffRemunerations here
    public static void printStaffRemunerations(Staff[] arr) {
        for (Staff s : arr) {
            System.out.println(s + " : " + s.remuneration()); // prints the name
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Staff[] sArr = new Staff[4];
        sArr[0] = new Faculty(sc.next(), sc.next(), sc.nextInt());
        sArr[1] = new Faculty(sc.next(), sc.next(), sc.nextInt());
        sArr[2] = new Hod(sc.next(), sc.next(), sc.nextInt());
        sArr[3] = new Hod(sc.next(), sc.next(), sc.nextInt());
        printStaffRemunerations(sArr);
    }
}
