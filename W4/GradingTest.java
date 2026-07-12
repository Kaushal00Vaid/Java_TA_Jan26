package W4;

import java.util.*;

// define interface
interface Gradable {
    void assignGrade(int marks);
}

class ExamBranch {
    // Define private inner class JavaPractical
    private class JavaPractical implements Gradable {
        public void assignGrade(int marks) {
            switch (marks / 10) {
                case 9:
                    System.out.println("Grade S");
                    break;
                case 10:
                    System.out.println("Grade S");
                    break;
                case 8:
                    System.out.println("Grade A");
                    break;
                default:
                    System.out.println("Needs Improvement");
                    break;
            }
        }
    }

    // Define private inner class StatsTheory
    private class StatsTheory implements Gradable {
        public void assignGrade(int marks) {
            if (marks > 85) {
                System.out.println("Excellent Analyst");
            } else if (marks > 50) {
                System.out.println("Passed Theory");
            } else {
                System.out.println("Retake Required");
            }
        }
    }

    // Define getJavaGrader()
    public Gradable getJavaGrader() {
        return new JavaPractical();
    }

    // Define getStatsGrader()
    public Gradable getStatsGrader() {
        return new StatsTheory();
    }
}

public class GradingTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int javaMarks = sc.nextInt();
        int statsMarks = sc.nextInt();

        ExamBranch branch = new ExamBranch();
        Gradable javaGrader = branch.getJavaGrader();
        Gradable statsGrader = branch.getStatsGrader();

        System.out.println("Java Practical Grade:");
        javaGrader.assignGrade(javaMarks);

        System.out.println("Stats Theory Grade:");
        statsGrader.assignGrade(statsMarks);
    }
}
