class Student {
    String name;
    double[] marks;

    Student(String name_, double[] marks_) {
        name = name_;
        marks = marks_;
    }

    // copy constructor
    Student(Student st) {
        name = st.name;
        // marks = st.marks; // SHALLOW COPY
        marks = new double[st.marks.length]; // MAKING SURE I CREATE A NEW MEMORY STORAGE for this marks --> DEEP COPY

        // COPYING FROM ONE OBJECT TO OTHER
        int idx = 0;
        for(double i : st.marks) {
            marks[idx++] = i;
        }

        for(int i = 0; i < st.marks.length; i++) {
            marks[i] = marks[i];
        }
    }
}

public class ShallowDeepCopy {

    static void printStudent(Student st) {
        System.out.println("Name: " + st.name);

        for(int i = 0; i < st.marks.length; i++) {
            System.out.println(st.marks[i]);
        }
    }

    public static void main(String[] args) {
        double[] marks = new double[]{4.5, 3.5, 2.5, 3.5};
        Student st1 = new Student("Kaushal", marks);
        Student st2 = new Student(st1);

        st2.name = "Random Name";
        st2.marks[2] = 45;

        System.out.println("Student 1 details");
        printStudent(st1);

        System.out.println();

        System.out.println("Student 2 details");
        printStudent(st2);

    }
}
