package C20180625_ExercisesAndFunctions.Exercises;
import java.util.Scanner;

public class ExerciseANDSwitch {
    public static void main(String[] args) {

        int limit = 100;

        Scanner teclado = new Scanner(System.in);
        char continuacion = 'y';
        while (continuacion == 'y' || continuacion == 'Y') {
            System.out.println(" ");
            System.out.println("-----Flow Control Type-----");
            System.out.println("¿Which one do you want to use?");
            System.out.println("1. For");
            System.out.println("2. While");
            System.out.println("3. Do-While");
            byte controlDeFlujo = teclado.nextByte();
            switch (controlDeFlujo) {
                case 1:
                    System.out.println(" ");
                    System.out.println("For loop");

                    //int limit = 100;

                    for (int i = 10; i <= limit; i+=10) {

                        if (i == limit) {
                            System.out.print(" y " + i);
                        } else if (i == limit - 10) { // i == 90
                            System.out.print(i);
                        } else {
                            System.out.print(i + ", " );
                        }

                    }

                    break;

                case 2:
                    System.out.println(" ");
                    System.out.println("While loop");

                    int a = 10;

                    while (a <= limit){
                        if (a == limit) {
                            System.out.print(" y " + a);
                        } else if (a == limit - 10) {
                            System.out.print(a);
                        } else {
                            System.out.print(a + ", ");
                        }
                        a+= 10;
                    }

                    break;

                case 3:
                    System.out.println(" ");
                    System.out.println("Do-While loop");

                    a = 10; //Reboot the value

                    do {
                        if (a == limit) {
                            System.out.print(" y " + a);
                        } else if (a == limit - 10) {
                            System.out.print(a);
                        } else {
                            System.out.print(a + ", ");
                        }
                        a+= 10;

                    } while (a <= limit);

                    break;
            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("¿You want to make another flow?");
            System.out.println("Yes or No");
            continuacion = teclado.next().charAt(0);
        }
        System.out.println("Flow control completed");

    }


}
