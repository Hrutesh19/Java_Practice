import java.util.Scanner;
import java.util.Random;
public class GuessingNumber {

    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100) + 1; // Generates a random number between 1 and 100
        int maxTries = 5;
        int tries = 0; // Counter for the number of tries

        Scanner scan = new Scanner(System.in);

        while (tries < maxTries) {
            System.out.println("Guess the number between 1 and 100 (Attempt " + (tries + 1) + " of " + maxTries + "):");
            System.out.print("Enter your guess: ");
            int userGuess = scan.nextInt();
            tries++;

            if (userGuess == num) {
                System.out.println("Congratulations! You guessed the right number.");
                break; // Exit the loop if the guess is correct
            } else if (userGuess < num) {
                System.out.println("You are close to the guessed number, but it's higher.");
            } else {
                System.out.println("You are close to the guessed number, but it's lower.");
            }

            if (tries < maxTries) {
                System.out.println("You have " + (maxTries - tries) + " attempts remaining.\n");
            }
        }

        if (tries == maxTries) {
            System.out.println("Sorry, you've used all your attempts. The correct number was " + num + ".");
        }

        scan.close();
    }
}
