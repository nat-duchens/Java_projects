import java.util.Scanner;

public class CineApp {

    public static void main(String[] args) {

        Scanner keyBoard = new Scanner(System.in);
        //Scanner class is used to read input data

        System.out.println("----Cine App ----\n");
        System.out.println("Movie ticket prices are:\n" +
                "*General admission $3500 CLP\n" +
                "*For those over 60, there's a 55% discount\n" +
                "*For children under 5, there's a 60% discount\n");

        //Ask for the user age
        System.out.println("Indicate your age: "); //Ask the age
        int age = keyBoard.nextInt();
        int ticketPrice = 3500;

        //Define the ticket value
        if (age >= 60) {
            if (age >= 120) {
                System.out.println("Invalid range of age");
            } else {
                System.out.println("The cost of the ticket is: " + (ticketPrice * 45 / 100)); //55% discount
            }
        } else if (age <= 5) {
            if (age < 0) {
                System.out.println("Invalid range of age");
            } else {
                System.out.println("The cost of the ticket is: $" + (ticketPrice * 40 / 100)); //60% discount
            }

        } else {
            System.out.println("The cost of the ticket if the general price: $3500");
        }
    }
}