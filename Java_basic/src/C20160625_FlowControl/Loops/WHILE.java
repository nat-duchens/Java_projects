package C20160625_FlowControl.Loops;

import java.util.Scanner;

public class WHILE {
    public static void main(String[] args) {

        System.out.println("While example");

        //Variables through the console
        Scanner keyBoard = new Scanner(System.in);

        System.out.println("¡Indicate a number!");
        //int number = keyBoard.nextInt(); //.netInt() to add only number and no text, but if I input text the code die
        int number = -1; //With this option I can input a letter and the code does not die

        while (number < 1 || number > 100) {
            System.out.println("The input number must to be from 1 to 100.");
            if (keyBoard.hasNextInt()) {
                number = keyBoard.nextInt(); //Read new number
            } else {
                // If it's not a number, consume the invalid input and ask again
                keyBoard.next(); // consume invalid input
                System.out.println("That's not a number. Try again.");

            }
        }

        System.out.println("The input number is: " + number);

    }
}
