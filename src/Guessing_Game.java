import java.util.Random;
import java.util.Scanner;

public class Guessing_Game {
    public static void main(String[] args) {
        // Setting up a scanner and random number generator
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        //  Defining the range (for example, between 1 and 100)
        int lowerBound = 1;
        int upperBound = 100;
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

        // Initialising variables for tracking guesses and attempts
        int userGuess = 0;
        int attempts = 0;
        
        //  Explaining the game to the user
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between " + lowerBound + " and " + upperBound + ".");
        System.out.println("Can you guess what it is?");
        
        //  Game loop - continue until the user guesses the correct number
        while (userGuess != randomNumber) {
            System.out.print("Enter your guess: ");
            
            // Reading the user's input and check if it's a valid number
            if (scanner.hasNextInt()) {
                userGuess = scanner.nextInt();
                attempts++; // Increment the number of attempts

                // Providing feedback
                if (userGuess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > randomNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the correct number.");
                    System.out.println("It took you " + attempts + " attempts.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clearing the invalid input
            }
        }
        
        // Closing the scanner
        scanner.close();
    }
}











