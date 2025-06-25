package C20160625_FlowControl.Conditionals;

import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {

//        1. Considering the practical example of using if and else, **generate a new program** that allows for verification.
//        2. **Validate** the age field entered by the user and continue with registration **only if they are over 18 years old**.
//        3. Additionally, add logic to also validate if a user has **more than $50 as an initial balance**.
//        4. In summary, a user should only be registered if their initial balance is greater than $50 and they are 18 years old or older.
//
//        Remember to use `Scanner` to receive input.**

        Scanner keyBoard = new Scanner(System.in); //Variables though the keyboard

        System.out.println("----I need some data about you to register ----\n");

        //Ask for the age
        System.out.println("Write your age in console");
        int age = keyBoard.nextInt();

        //Ask for the money it has
        System.out.println("How much balance do you have?");
        int balance = keyBoard.nextInt();

        if (age >= 18) {
            System.out.print("You are an adult");
            if (balance > 50) {
                System.out.println(" and you have enough money to be register!");
            }else {
                System.out.print(" and you're broke!");
            }

        } else {
            System.out.println("Your ar a minor");
        }
    }
}
