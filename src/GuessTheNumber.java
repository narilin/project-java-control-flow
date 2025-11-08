import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1; // Número aleatorio entre 1 y 100
        Scanner scanner = new Scanner(System.in);
        int guess;
        int attempts = 0;

        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");

        // TODO: Add a while loop here to implement the guessing game
        while (true) {
    System.out.print("Enter your guess: ");
    guess = scanner.nextInt();
    attempts++;

    if (guess < numberToGuess) {
        System.out.println("Too low! Try again.");
    } else if (guess > numberToGuess) {
        System.out.println("Too high! Try again.");
    } else {
        System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
        break;
    }
}

        scanner.close();
    }
}
