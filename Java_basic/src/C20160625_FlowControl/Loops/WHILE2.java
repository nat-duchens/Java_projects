package C20160625_FlowControl.Loops;

import java.util.Random;
import java.util.Scanner;

public class WHILE2 {
    public static void main(String[] args) {

        Scanner keyBoard = new Scanner(System.in);
        Random random = new Random();

        int attempt = 0;
        boolean guessed = false;
        int secretNumber = random.nextInt(11); // Número entre 0 y 10

        System.out.println("Guess the number between 0 and 10!");

        while (!guessed && attempt < 3) {
            System.out.print("Enter your guess: ");
            int userGuess = keyBoard.nextInt();
            attempt++;

            if (userGuess == secretNumber) {
                guessed = true;
                System.out.println("Correct! You guessed the number in " + attempt + " attempt(s).");
            } else if (userGuess < secretNumber) {
                System.out.println("The number is greater.");
            } else {
                System.out.println("The number is smaller.");
            }
        }

        if (!guessed) {
            System.out.println("You've used all attempts. The number was: " + secretNumber);
        }

        keyBoard.close();
    }
}
