package C20160625_FlowControl.Conditionals;

import java.util.Scanner;

public class Ternary_If_Else2 {

    public static void main(String[] args) {

//        1. Considering the practical example of using if and else, **generate a new program** that allows for verification.
//        2. **Validate** the age field entered by the user and continue with registration **only if they are over 18 years old**.
//        3. Additionally, add logic to also validate if a user has **more than $50 as an initial balance**.
//        4. In summary, a user should only be registered if their initial balance is greater than $50 and they are 18 years old or older.
//
//        Remember to use `Scanner` to receive input.**

        Scanner keyBoard = new Scanner(System.in); //Input trough console

        System.out.println("How old are you?");
        int age = keyBoard.nextInt();

        System.out.println("How much balance do you have in cash?");
        int balance = keyBoard.nextInt();

        String registration2 = (age >= 18 && balance > 50) // If
                ? "Registration complete"
                : (age >= 18) //Else if
                    ? "You're a broke adult"
                    : (balance > 50) //Else if
                        ? "You have the money, but you're a minor"
                        : "Too young, too broke"; //Else
        System.out.println(registration2);
    }
}
