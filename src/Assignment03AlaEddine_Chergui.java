
public class Assignment03AlaEddine_Chergui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		    // Program rolls a 10-sided dice 1000 times and records the number
		    // of occurrences of each result.
		    
		    int roll = 0;
		    int[] diceRolls = new int[10];  // Stores counts for each face 1 to 10
		    int totalRolls = 0;

		    // Sample the rolls 1000 times
		    for(int count = 0; count < 1000; count++) {
		        roll = (int)(Math.random() * 10) + 1; // Random number 1-10
		        diceRolls[roll - 1] = diceRolls[roll - 1] + 1; // Increment count for that roll
		    }

		    // Run a report (print counts)
		    for(int index = 0; index < diceRolls.length; index++) {  // Fix: use '<' not '<='
		        System.out.printf("Count of %d is: %d%n", (index + 1), diceRolls[index]);
		        totalRolls = totalRolls + diceRolls[index];
		    }

		    System.out.println("Total rolls were: " + totalRolls);
		    System.out.println("Program by Ala Eddine Chergui"); // Replace with your full name
		}

	}


