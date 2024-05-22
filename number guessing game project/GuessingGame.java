import java.util.Scanner;

public class GuessingGame {

  public static void main(String[] args) {
    // Generate a random number between 1 and 100
    int numberToGuess = (int) (Math.random() * 100) + 1;

    // Create a Scanner object to read user input
    Scanner scanner = new Scanner(System.in);

    boolean guessed = false;
    int numGuesses = 0;

    while (!guessed) {
      // Prompt the user to guess a number
      System.out.println("Guess a number between 1 and 100:");
      int guess = scanner.nextInt();
      numGuesses++;

      // Check if the guess is correct
      if (guess == numberToGuess) {
        guessed = true;
        System.out.println("You guessed it! The number was " + numberToGuess + ".");
        System.out.println("It took you " + numGuesses + " guesses.");
      } else if (guess < numberToGuess) {
        System.out.println("Your guess is too low. Try again.");
      } else {
        System.out.println("Your guess is too high. Try again.");
      }
    }

    scanner.close();
  }
}
