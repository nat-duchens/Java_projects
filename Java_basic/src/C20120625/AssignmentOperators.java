package C20120625;

import java.util.Scanner;

public class AssignmentOperators { //Here it is defined a class scope
    //Main is the point of entrance to this software
    public static void main(String[] args) { //Here it define a local scope or a function scope
        //Assignment operators//
        /*
        * = -> assigment
        * += -> add the value and assign the result
        * -= -> subtract the value and assign the result
        * *= -> multiply the value and assign the result
        * /= -> divide the value and assign the result
        * ++ -> increment, adds +1 to the current value of the variable
        * -- -> decrement, subtracts -1 from the current value of the variable
        * */

        //Variables a través de console
        Scanner keyBoard = new Scanner(System.in);

        //1. Ask the first number
        System.out.println("Indicate the first number");
        int numberOne = keyBoard.nextInt();

        //2. Ask the second number
        System.out.println("Indicate the second number");
        int numberTwo = keyBoard.nextInt();

        //3. Print both numbers
        System.out.println("The first number is: " + numberOne + " and " + "the second number is: " + numberTwo);

        //4. Perform different assignments
        System.out.println(numberOne += numberTwo); //Ex. numberOne(5) and numberTwo(2) -> 7
        System.out.println(numberOne -= numberTwo); //Ex. numberOne(7) and numberTwo(2) -> 5
        System.out.println(numberOne *= numberTwo); //Ex. numberOne(5) and numberTwo(2) -> 10
        System.out.println(numberOne /= numberTwo); //Ex. numberOne(10) and numberTwo(2) -> 5

        System.out.println("Now the first number is equivalent to: " + numberOne);
        //System.out.println("Now the second number is equivalent to: " + numberTwo);

        //** Increments and Decrements **//
        System.out.println("By doing a preincrement, numberOne is equivalent to: " + ++numberOne); //6
        System.out.println("By doing a pos-increment, numberOne is equivalent to: " + numberOne++); //6 ++
        System.out.println("Now numberOne is equivalent to: " + numberOne); //7
        System.out.println("By doing a predecrement, numberTwo is equivalent to: " + --numberTwo); //1
        System.out.println("By doing a pos-decrement, numberTwo is equivalent to: " + numberTwo--); //1 --
        System.out.println("Now numberTwo is equivalent to: " + numberTwo); //0





    }
}
