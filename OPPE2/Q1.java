package OPPE2;

import java.util.*;

class Project implements Cloneable {
    private String proj_name;
    private double budget;

    public Project(String nm, double b) {
        proj_name = nm;
        budget = b;
    }

    public void setProjectName(String nm) {
        proj_name = nm;
    }

    public String toString() {
        return "Project: " + proj_name + ", budget: " + budget;
    }

    // Write code to implement clone() method
    public Project clone() throws CloneNotSupportedException {
        return (Project) super.clone();
    }
}

class Manager implements Cloneable {
    private String mngr_name;
    private Project proj;

    public Manager(String mn, Project p) {
        mngr_name = mn;
        proj = p;
    }

    public String toString() {
        return proj + "\n" + "Manager: " + mngr_name;
    }

    // Write code to implement clone() method
    public Manager clone() throws CloneNotSupportedException {
        Manager newObj = (Manager) super.clone(); // shallow copy
        newObj.proj = proj.clone();
        return newObj;
    }
}

class Team implements Cloneable {
    private String teamName;
    private Manager mngr;

    public Team(String tn, Manager m) {
        teamName = tn;
        mngr = m;
    }

    public void setTeamName(String tn) {
        teamName = tn;
    }

    public void setManager(Manager m) {
        mngr = m;
    }

    public String toString() {
        return teamName + "\n" + mngr;
    }

    // Write code to implement clone() method
    public Team clone() throws CloneNotSupportedException {
        Team newObj = (Team) super.clone(); // shallow
        newObj.mngr = mngr.clone();

        return newObj;
    }
}

public class Q1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);
        Project p1 = new Project("AI Development", 100000);
        Manager m1 = new Manager("Madhu", p1);
        Team t1 = new Team("Alpha", m1);
        Team t2 = t1.clone();
        t2.setTeamName(sc.nextLine());
        t2.setManager(new Manager(sc.nextLine(),

                new Project(sc.nextLine(), sc.nextDouble())));

        System.out.println("Team t1: " + t1);
        System.out.println("Team t2: " + t2);
        sc.close();
    }
}
