package OPPE;

import java.util.*;

class Company {
    private Map<String, ArrayList<Integer>> employeeMap;

    public Company(Map<String, ArrayList<Integer>> e) {
        employeeMap = e;
    }

    public Map<String, ArrayList<Integer>> getEmployeeMap() {
        return employeeMap;
    }
}

public class TestQ6 {
    // Define the method getFinalList( ) here
    public static ArrayList<String> getFinalList(Company c) {
        boolean flag = true;
        ArrayList<String> answers = new ArrayList<>();

        // getting the map
        Map<String, ArrayList<Integer>> hash = c.getEmployeeMap();

        // iterate through the map - EntryMap
        // for (Map.Entry<String, ArrayList<Integer>> i : hash.entrySet()) {
        // flag = true;
        // ArrayList<Integer> values = i.getValue();

        // for (Integer curr : values) {
        // if (curr < 10) {
        // flag = false;
        // break;
        // }
        // }

        // if (flag) {
        // answers.add(i.getKey());
        // }
        // }

        // return answers;

        for (String name : hash.keySet()) {
            flag = true;
            ArrayList<Integer> values = hash.get(name);

            for (Integer curr : values) {
                if (curr < 10) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                answers.add(name);
            }
        }

        return answers;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, ArrayList<Integer>> emap = new LinkedHashMap<String, ArrayList<Integer>>();
        for (int i = 0; i < 3; i++) {
            ArrayList<Integer> targetList = new ArrayList<Integer>();
            String name = sc.next();
            for (int j = 0; j < 3; j++) {
                targetList.add(sc.nextInt());
            }
            emap.put(name, targetList);
        }
        Company c = new Company(emap);
        System.out.println(getFinalList(c));
    }
}
