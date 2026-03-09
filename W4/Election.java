package W4; 

import java.util.Scanner;	

class Voter{	
    static int total_no_of_voters = 0;
    int current_voter_count = 0;
    Voter new_voter;

    // Define appropriate variables for implementing singleton behaviour
    // in accordance with the given coded parts and sample output

    private Voter() {                           
		current_voter_count++;	
    }

    public static Voter getVoter() {
        //implement singleton behaviour --> getter
        Voter v = new Voter();
        return v;

        // return new Voter();
    }

    public void firstVoter(){
        if(new_voter != null) {
            EVM new_machine = EVM.getEVM(new_voter);
            new_machine.startVoting();
        }
    }

    public void callNewVoter() {
        // Write code to setup a new EVM object for the new voter
    
        //Ignore the following 6 lines of code
        //but do not delete this code in your submission 
        //======================================================================== 
        try {
            EVM x = EVM.getEVM(null);
            x.startVoting();
        }catch(NullPointerException e) {
            System.out.println("EVM is Singleton");
	    }
//========================================================================  	
	        // Resume writing your code here
	   
	        // Hint: Write code to start voting for the new user on the new EVM
    }
}

class EVM {

    // Define appropriate variables for implementing singleton behaviour
    // in accordance with the given coded parts and sample output
    Voter current_voter;
    int evm_count;

        private EVM(Voter v) {
            current_voter = v;
		    evm_count++;
        }

        public static EVM getEVM(Voter v) {
            // Implement singleton behaviour
            // return object of EVM
            EVM ob = new EVM(v);
            return ob;
        }

        public void startVoting() {
            // Complete voting for the current voter and call the next voter
            // Hint : Use callback here
        }
}


public class Election{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        Voter.total_no_of_voters =  s.nextInt();
        // Assume input is always non zero
        Voter v = Voter.getVoter();

        //Trying to create another voter when one voter is in the middle of 
        //voting process, students can ignore this try-catch block of code

        try {
            Voter x = Voter.getVoter();
            x.callNewVoter();
        } catch(NullPointerException e) {
            System.out.println("Voter is Singleton");
        }
    
        //Starting the first vote of the day
        v.firstVoter();
    }
}