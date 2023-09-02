import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        Random random = new Random();
        int num = random.nextInt(100) + 1;

        System.out.println("Guess the number between 1 and 100.");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your guess: ");
        int userGuess = scan.nextInt();

        if (userGuess == num) {
            System.out.println("You guessed the right number!");
        } else if (userGuess < num) {
            System.out.println("You are close to the guessed number, but it's higher.");
        } else {
            System.out.println("You are close to the guessed number, but it's lower.");
        }
    }
}
