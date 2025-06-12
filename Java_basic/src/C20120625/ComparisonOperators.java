package C20120625;

import javax.swing.*;
import java.io.PrintStream;
import java.util.Scanner;

public class ComparisonOperators {
    public static void main(String[] args) {
        //Comparison operators have results as true or false
        /*
        * == -> equal to
        * > -> greater than
        * < -> less than
        * >= -> greater than or equal to
        * <= -> less than or equal to
        * != -> not equal to
        * */

        //Variables through the console
        Scanner keyBoard = new Scanner(System.in);

        //1. Defined our variables for comparison, through the console input
        System.out.println("Indicate the first number");
        int numberOne = keyBoard.nextInt();
        System.out.println("Indicate the second number");
        int numberTwo = keyBoard.nextInt();
        keyBoard.nextLine();
        System.out.println("The result of the addition is " + (numberOne + numberTwo));

       //String wordOne = JOptionPane.showInputDialog(null, "Now indicate the first word:");
        System.out.println("Now indicate the first word");
        String wordOne = keyBoard.nextLine();
        System.out.println("Now indicate the second word");
        String wordTwo = keyBoard.nextLine();
        System.out.println(wordOne + wordTwo);
        //System.out.println(numberOne + " - " + numberTwo + " - " + wordOne + " - " + wordTwo);

        //2.Generate comparison expressions to obtain a boolean, using the operators

        //Expressions for comparing numbers
        System.out.println("numberOne is equal to numberTwo? = " + (numberOne == numberTwo)); //Expression, evaluate first and the result is concatenated
        //sout -> adds System.out.println()
        System.out.println("numberOne is greater than numberTwo? = " + (numberOne > numberTwo));
        System.out.println("numberOne is less than numberTwo? = " + (numberOne < numberTwo));
        System.out.println("numberOne is distinct to numberTwo? = " + (numberOne != numberTwo));

        //Expressions to compare words
        System.out.println("wordOne is equal to wordTwo? = " + (wordOne == wordTwo));
        //The == operator does not work for comparing strings, even if they are the same words.
        //The == evaluates whether they have the same address and not the same content
        System.out.println("compare both string variables, with the string class method .equal(), and we obtain = " + wordOne.equals(wordTwo));

        //**** Logic Operators ****//
        //This operators allow us to combine more than one expression
        /*
        * && (logic and) -> It allows both conditions to be evaluated inclusively. Returns true if both expressions being combined are true.
        * || (logic or) -> It allows us to evaluate whether one of the two conditions is true.
        * ! (not) -> Inverts the Boolean value of an expression.
        * ! -> If the expression is true, the ! operator returns false, and if the expression is false, the ! operator returns true.
        */

        boolean combinationNumericComparison = ((numberOne >= numberTwo) && (numberOne == numberTwo));
        System.out.println("The result of the combination is: " + combinationNumericComparison);

        boolean combinationWordsComparison = (wordOne.equals(wordTwo) && wordOne.equalsIgnoreCase(wordTwo));
        System.out.println("The result of the combination of both words in String is: " + combinationWordsComparison);

        boolean combinationPossibilities = (wordOne.equals("Hello") || wordTwo.equals("World"));
        System.out.println("The result of the combination is: " + combinationPossibilities);
        // equals() vs equalsIgnoreCase(), the first is case sensitive and the second not
        boolean combinationPossibilities2 = (wordOne.equalsIgnoreCase("Hello") || wordTwo.equalsIgnoreCase("World"));
        System.out.println("The result of the combination is: " + combinationPossibilities2);

        System.out.println("The result of deny through not (!) is: " + !combinationPossibilities);


    }
}
