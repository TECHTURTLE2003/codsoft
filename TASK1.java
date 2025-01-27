package numberGame;
import java.util.*;
public class NumberGuessing {
	 public static void
	    guessingNumberGame()
	    {
	       
	        Scanner sc = new Scanner(System.in);
	 
	        // Generate the numbers form 1 to 100
	        int number = 1 + (int)(100
	                               * Math.random());
	 
	        // Given 3 trials
	        int it = 3;
	 
	        int i, guess;
	 
	        System.out.println("please choose a number between 1 to 100..........");
	 
	        // Iterate over "it" Trials
	        for (i = 0; i < it; i++) {
	 
	            System.out.println(
	                "Please Guess a number: ");
	 
	            // Take input for guessing
	            guess = sc.nextInt();
	 
	            // If the number is guessed
	            if (number == guess) {
	                System.out.println(
	                    "Congratulations.you guess the right number.The number is....."+number);
	                break;
	            }
	            else if (number > guess
	                     && i != it - 1) {
	                System.out.println(
	                    " The number is too small ");
	            }
	            else if (number < guess
	                     && i != it - 1) {
	                System.out.println(
	                    " The number is too long ");
	            }
	        }
	 
	        if (i == it) {
	            System.out.println(
	                "You have complete the limit.Better luck next time!!!!!");
	 
	            System.out.println(
	                "The number was " + number);
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 guessingNumberGame();
		

	}

}
