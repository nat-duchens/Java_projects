package C20160625_FlowControl;

import java.util.Scanner;

public class Learn {

    public static void main(String[] args) {

        //Variables through the console
        Scanner keyBoard = new Scanner(System.in);

        System.out.println("Im going to aks you for some data");
        System.out.print("What is your first name?: ");
        String firstName = keyBoard.nextLine();
        System.out.print("What is your first surname?: ");
        String firstSurname = keyBoard.nextLine();
        System.out.print("What is your second surname?: ");
        String secondSurname = keyBoard.nextLine();

        // System.out.println("Your full name is: " + firstName + " " + firstSurname + " " + secondSurname);
        System.out.printf("Your full name is: %s %s %s%n", firstName, firstSurname, secondSurname); //Other way to do it


    }
}
