package C20180625_ExercisesAndFunctions.Exercises;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        char continuacion = 's';
        while (continuacion == 's' || continuacion == 'S') {
            System.out.println("-----Tipo de Control de flujo-----");
            System.out.println("¿cual quieres usar?");
            System.out.println("1. for");
            System.out.println("2. while");
            System.out.println("3. do-while");
            byte controlDeFlujo = teclado.nextByte();
            switch (controlDeFlujo) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
            System.out.println("¿Quieres hacer otro flujo?");
            System.out.println("si o no");
            continuacion = teclado.next().charAt(0);
        }
        System.out.println("Control de flujo finalizado");
    }

    }
