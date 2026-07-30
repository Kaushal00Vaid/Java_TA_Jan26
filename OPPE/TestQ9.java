package OPPE;

import java.util.Scanner;

interface IResearchScholar {
    public void teaches(String str);

    public void studies(String str);
}

class JuniorRS implements IResearchScholar {
    public void studies(String str) {
        System.out.println("TA studies " + str);
    }

    public void teaches(String str) {
        System.out.println("TA teaches " + str);
    }
}

class SeniorRS extends JuniorRS {

}

public class TestQ9 extends SeniorRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine(); // Python
        String str2 = sc.nextLine(); // Java
        JuniorRS jrs = new TestQ9();
        SeniorRS srs = new TestQ9();
        jrs.studies(str1);
        srs.studies(str2);
        srs.teaches(str2);
        sc.close();
    }
}