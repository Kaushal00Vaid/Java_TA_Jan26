package W7;

class NotValidTeamException extends Exception {
    NotValidTeamException(String msg) {
        super(msg);
    }
}

class CricketTeam {
    int[] scores;

    CricketTeam(int[] arr) {
        scores = arr;
    }

    public boolean func() throws NotValidTeamException {
        // if any player is having < 50 score

        // if array size < 11 --> throw ArraySizeMismatchException

        for (int i = 0; i < 11; i++) {
            if (this.scores[i] < 50) {
                throw new NotValidTeamException("Change the team " + i + "");
            }
        }

        return true;
    }
}

public class CricketTeamTest {
    public static void main(String[] args) {
        int[] arr = new int[] { 60, 70, 70, 80 };
        try {
            CricketTeam ob = new CricketTeam(arr);
            ob.func();
        } catch (NotValidTeamException e) {
            System.out.println(e.getMessage());
        }
    }

}
