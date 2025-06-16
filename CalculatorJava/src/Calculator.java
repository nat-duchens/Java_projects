import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) { //main is the entrance port to the program

        Scanner keyBoard = new Scanner(System.in);
        //Scanner class is a utility class from the java.util package, is used to read input data.

        /* My idea is:
        * First, ask the user for the numbers
        * Second, store the numbers in variables: numberOne and numberTwo
        * Third, ask for the arithmetic operation to be performed
        *
        * */

        //First number
        System.out.println("Indicate the first number");
        float numberOne = keyBoard.nextInt();
        System.out.println("Indicate the second number");
        float numberTwo = keyBoard.nextInt();
        System.out.println("Indicate the arithmetic symbol of operation: +, -, *, /");
        char symbol = keyBoard.next().charAt(0); //To read a single character with Scanner, I google it :)
        keyBoard.nextLine();

        // System.out.println("The result is: " + numberOne + symbol + numberTwo);
        // Arithmetics symbols are operators, it can be stored as int
        System.out.println("The operation is: " + numberOne + symbol + numberTwo);

        float result = 0; //New variable

        //Mix of if and else if to use the arithmetics symbols
        //Instructions to make the operations

        if (symbol == '+') {
            result = numberOne + numberTwo;
        } else if (symbol == '-') {
            result = numberOne - numberTwo;
        } else if (symbol == '*') {
            result = numberOne * numberTwo;
        } else if (symbol == '/') {
            result = numberOne / numberTwo;
        }

        System.out.println("The result of the operation is: " + result); //The end

        //Know celebrate :3
        //I think I could make a better calculator, maybe add restricted symbols
        //Maybe use else to the restrictions
        //I tried, but I couldn't
        //In the future, when I learn more I'll make a better calculator

    }
}
