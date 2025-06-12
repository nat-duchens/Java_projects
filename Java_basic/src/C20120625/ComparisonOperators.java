package C20120625;

import javax.swing.*;
import java.io.PrintStream;
import java.util.Scanner;

public class ComparisonOperators {
    public static void main(String[] args) {
        //Comparison operators have results as true or false
        /*
        * == -> igual que
        * > -> mayor que
        * < -> menor que
        * >= -> mayor o igual que
        * <= -> menor o igual que
        * != -> distinto de
        * */

        //Variable a treaves de console
        Scanner keyBoard = new Scanner(System.in);

        //1. Defined our variables for comparison, a traves del input por console
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

        System.out.println(numberOne + " - " + numberTwo + " - " + wordOne + " - " + wordTwo);
        //2.generamos expresioens de ocmapracion para obtener un boolean, utilizando los operadores






    }
}
