import java.util.*;

public class NumberGuessingGame 
{
public static void main(String[] args) 
	  {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 5;
        int rounds = 0;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You have " + maxAttempts + " attempts to guess the number between " + minRange + " and " + maxRange);

        while (true) 
        {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;

            while (attempts < maxAttempts) 
            {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == targetNumber) 
                {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    score++;
                    break;
                } else if (userGuess < targetNumber) 
                {
                    System.out.println("Your guess is low. Try again.");
                } 
                    else 
                {
                    System.out.println("Your guess is high. Try again.");
                }

                if (attempts == maxAttempts) {
                    System.out.println("Sorry, you've used all your attempts. The correct number was " + targetNumber);
                }
            }

            System.out.print("Do you want to play another round? (yes/no): ");
            String playAgain = scanner.next();
            if (!playAgain.equalsIgnoreCase("yes")) 
            {
                break;
            }
            else{
	rounds++;
	}
        }
        
        System.out.println("Game over! You played " + rounds + " rounds and your final score is: " + score);
        scanner.close();
    }
}