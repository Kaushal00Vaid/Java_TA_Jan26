package OPPE2;

import java.util.*;
import java.util.stream.*;

class Patient {
    private String name;
    private int age;
    private String chronicCondition;

    public Patient(String n, int a, String cC) {
        name = n;
        age = a;
        chronicCondition = cC;
    }

    public String toString() {
        return name + " - " + age;
    }

    public int getage() {
        return age;
    }

    public String getchronicCondition() {
        return chronicCondition;
    }

    // define method patientProcessor
    public static Stream<Patient> patientProcessor(ArrayList<Patient> arr) {

        // Patient[] arr;
        // Arrays.stream(arr);

        Stream<Patient> stream = arr.stream()
                .filter(x -> x.getage() < 30)
                .filter(x -> x.getchronicCondition().equals("Diabetes"));

        return stream;
    }
}

public class Q9 {
    public static void main(String[] args) {
        ArrayList<Patient> Patients = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            Patient obj = new Patient(sc.next(),
                    sc.nextInt(), sc.next());

            Patients.add(obj);
        }
        Stream<Patient> filteredStream = Patient.patientProcessor(Patients);
        filteredStream.forEach(System.out::println);
        sc.close();
    }
}
