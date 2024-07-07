// =================================================================================================== //
// ==================================                            ===================================== //
// ==================================         Mini Project       ===================================== //
// ==================================     Muhammad Bilal Ashiq   ===================================== //
// ==================================                            ===================================== //
// =================================================================================================== //


import  java.util.Scanner;

public class Project
{
    // ------------------->>> Just extra work to add colors <<<-------------------------
    public static final String RESET = "\u001B[0m";  // Reset color
    public static final String RED = "\u001B[31m";   // Red color
    public static final String GREEN = "\u001B[32m"; // Green color
    public static final String PINK = "\u001B[38;5;202m"; // Pink color
    // ----------------------------------------------------------------------------------



    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int secretNumber = (int) (Math.random() * 100) + 1;   // ---- Generate a random number between 1 and 100 
        int maxTries = 5;      // Maximum number of attempts
        int guessCount = 0;    // Count the number of guesses
 
        System.out.println(GREEN + "\n\t-- Welcome to the Number Guessing Game! -- \n" );
        System.out.println("I'm thinking of a number between 1 and 100. You have " + maxTries + " attempts to guess it." + RESET);

        // Loop for guessing
        while (guessCount < maxTries) 
        {
            System.out.print(PINK + "\n\nEnter your guess__ " + RESET);
            int guess = scanner.nextInt();
            guessCount++;

            if (guess == secretNumber) 
            {
                System.out.println(GREEN + "\n Congratulations! You guessed the number in " + guessCount + " tries.");
                break; // Exit the loop if guess is correct
            } 
            else if (guess < secretNumber) 
            {
                System.out.println("Your guess is too low. Try again.");
            } 
            else
            {
                System.out.println("Your guess is too high. Try again.");
            }

            System.out.print(RED + " ==> Attemps remaining: " +  (maxTries-guessCount) + " <==" + RESET);
        }

        // If the loop exits without guessing correctly
        if (guessCount == maxTries) 
        {
            System.out.println("\n\t==> Sorry, you ran out of guesses. The number was " + secretNumber);
        }

        scanner.close();
    }
}
