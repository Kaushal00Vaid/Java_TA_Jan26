package OPPE;

import java.util.*;

class Team {
    // {
    // "Ravi": [76, 76, 76],
    // "sonu": [80, 80, 80]
    // }
    private Map<String, ArrayList<Integer>> playerMap;

    public Team(Map<String, ArrayList<Integer>> m) {
        playerMap = m;
    }

    public Map<String, ArrayList<Integer>> getPlayerMap() {
        return playerMap;
    }

}

// FClass
public class Q4 {
    // Define the method getFinalList( ) here
    public static ArrayList<String> getFinalList(Team t) {
        // TASK
        // Find a list of player name --> that has score atleast 80 in all of his
        // matches

        // dynamic array --> ArrayList
        ArrayList<String> ans = new ArrayList<>();

        // get the player map
        Map<String, ArrayList<Integer>> playerMap = t.getPlayerMap();

        // iterate and check each player one by one
        for (String i : playerMap.keySet()) {
            // get the value --> list of scores
            ArrayList<Integer> scores = playerMap.get(i);

            boolean flag = true;
            // check if all >= 80
            for (Integer sc : scores) {
                if (sc < 80) {
                    flag = false;
                }
            }

            if (flag) {
                ans.add(i);
            }
        }

        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, ArrayList<Integer>> pmap =

                new LinkedHashMap<String, ArrayList<Integer>>();

        for (int i = 0; i < 3; i++) {
            ArrayList<Integer> pruns = new ArrayList<Integer>();
            String name = sc.next();
            for (int j = 0; j < 3; j++) {
                pruns.add(sc.nextInt());
            }
            pmap.put(name, pruns);
        }
        Team t = new Team(pmap);
        System.out.println(getFinalList(t));
    }
}