import java.util.Scanner;

public class CineApp2 {

    public static void main(String[] args) {

        Scanner keyBoard = new Scanner(System.in);

        int option; //Use the option as a number to switch between cases
        int age;
        int age2;
//        int age3;
//        int age4;
        int ticketPrice = 3500;

        do {
            System.out.println("\n----Cine App ----");
            System.out.println("Movie ticket prices are:\n" +
                    "*General admission $3500 CLP\n" +
                    "*For those over 60, there's a 55% discount\n" +
                    "*For children under 5, there's a 60% discount\n");
            System.out.print("1. To purchase one ticket\n"+
                    "2. To purchase two tickets\n" +
                    "3. To purchase more than two tickets\n" +
                    "4. Finish purchase\n" +
                    "Choose an option from 1 to 4: ");

            option = keyBoard.nextInt();

            switch (option) {
                case 1: //One ticket
                    System.out.print("\n----To purchase one ticket----\n" +
                            "Indicate your age: ");
                    age = keyBoard.nextByte();

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
                    System.out.println("------------------------------");
                    break;

                case 2: //Two tickets
                    System.out.print("\n----To purchase two tickets----\n");
                    System.out.print("Indicate your age: ");
                    age = keyBoard.nextInt(); //Age for the first person
                    System.out.print("Indicate the other person age: ");
                    age2 = keyBoard.nextInt(); //Age for the second person

                    int bill1 = 0; //Cost for the first ticket
                    int bill2 = 0; //Cost for the second ticket
                    int totalBill = 0; //To later print the total cost of the two ticket purchase

                    if (age >= 60) {
                        if (age >= 120) {
                            System.out.println("Invalid range of age");
                        } else {
                            bill1 = ticketPrice * 45 / 100; //55% discount
                        }
                    } else if (age <= 5) {
                        if (age < 0) {
                            System.out.println("Invalid range of age");
                        } else {
                            bill1 = ticketPrice * 40 / 100; //60% discount
                        }
                    } else {
                        bill1 = ticketPrice;
                    }

                    if (age2 >= 60) {
                        if (age2 >= 120) {
                            System.out.println("Invalid range of age");
                        } else {
                            bill2 = ticketPrice * 45 / 100; //55% discount
                        }
                    } else if (age2 <= 5) {
                        if (age2 < 0) {
                            System.out.println("Invalid range of age");
                        } else {
                            bill2 = ticketPrice * 60 / 100; //60% discount
                        }
                    } else {
                        bill2 = ticketPrice;
                    }

                    //Additional 30% of discount
                    if (bill1 > 0 && bill2 >0) {
                        totalBill = ((bill1 + bill2 ) * 70 / 100); //30% of discount
                        System.out.println("Total bill for the purchase of two tickets: $" + totalBill);
                    }
                    System.out.println("-------------------------------");
                break;

                case 3: //More than three tickets, for the moment I couldn't figure it out :c
                    System.out.println("\n----To purchase more than 2 tickets----");
                    System.out.print("This option is unavailable for the moment,\n" +
                            "the developer couldn't figure it out how make it work,\n" +
                            "sorry for the inconvenience!\n");
                    System.out.println("-----------------------------------------");
                    break;

                case 4:
                    System.out.println("\n----Bye, see you again!----");
                    break;

                default:
                    System.out.println("\n------------------------------");
                    System.out.println("Invalid option, Try again!");
                    System.out.println("------------------------------");
            }

        } while (option != 4); //If the option result to be 4, the loop it's going to stop
        keyBoard.close();
    }
}