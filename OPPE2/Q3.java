package OPPE2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.stream.*;

class Student {
    private String name, scholarshipStatus;
    private double avgCGPA, income;

    public Student(String n, double a, double i) {
        name = n;
        avgCGPA = a;
        income = i;
        scholarshipStatus = "not eligible";
    }

    public String toString() {
        return name + " : " + avgCGPA + " : "
                + income + " : " + scholarshipStatus;
    }

    public double getAvgCGPA() {
        return avgCGPA;
    }

    public double getIncome() {
        return income;
    }

    public void setScholarshipStatus(String ss) {
        scholarshipStatus = ss;
    }
}

public class Q3 {
    // Define method getEligibleStream here
    public static Stream<Student> getEligibleStream(ArrayList<Student> arr) {
        // int[] --> Arrays.stream(arr);
        Stream<Student> stream = arr.stream()
                .filter(x -> x.getAvgCGPA() > 7.5)
                .filter(x -> x.getIncome() < 100000);

        // Stream<Student> stream = arr.stream()
        // .filter(x -> x.getAvgCGPA() > 7.5 && x.getIncome() < 100000);

        return stream;
    }

    // Define method updateScholarshipStatus here
    public static void updateScholarshipStatus(List<Student> arr) {
        for (Student i : arr) {
            if (i.getAvgCGPA() > 9.0) {
                i.setScholarshipStatus("grade-1 scholarship");
            } else {
                i.setScholarshipStatus("grade-2 scholarship");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> sList = new ArrayList<Student>();
        Student s;
        for (int i = 0; i < 4; i++) {
            s = new Student(sc.next(), sc.nextDouble(), sc.nextDouble());
            sList.add(s);
        }
        List<Student> eList = getEligibleStream(sList).collect(Collectors.toList());
        updateScholarshipStatus(eList);
        for (Student es : eList)
            System.out.println(es);
        sc.close();
    }
}