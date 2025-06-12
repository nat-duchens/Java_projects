package C20110625;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Create an instance for the class Variable -> Now this is an instance that occupied an space in memory
        Variables variable = new Variables();
        Scanner myScanner = new Scanner(System.in);

        //Instantiating an object is equivalent to allocating a space in memory
        //This happens when creating a variable from a class

        //** Access to the variables we created previously **//
        //Instance variables --> They need a variable to be created with the data type to be accessible
        System.out.println("Hello, mi age is " + variable.age);

        //Class variables --> They do not need a variable to be created, they need the word static to be indicated
        System.out.println(Variables.greeting);
        System.out.println("Today is " + Variables.WeekDays.Wednesday);

        //Try arithmetics operations
        Operators operators = new Operators();

        System.out.println("***** From here we are starting to play with arithmetics operators *****");
        System.out.println("Result addition -> " + operators.resultAddition);
        System.out.println("Result substraction -> " + operators.resultSubstraction);
        System.out.println("Result multiplication -> " + operators.resultMultiplication);
        System.out.println("Result division -> " + operators.resultDivision);
        System.out.println("Result module -> " + operators.resultModule);

    }
}
