package C20180625_ExercisesAndFunctions.Exercises;

import java.util.Scanner;

public class SwitchV2 {
    public static void main(String[] args) {

            int incremento = 10;

        System.out.println("\nPrograma Java que imprime secuencia numérica del 10 al 100 \n");

        Scanner teclado = new Scanner(System.in);

        System.out.println("El programa cuenta con las siguientes opciones:");
        System.out.println("1. Secuencia numérica a través de bucle [for]");
        System.out.println("2. Secuencia numérica a través de bucle [while]");
        System.out.println("3. Secuencia numérica a través de bucle [do while]");
        System.out.println("4. Salir");

        System.out.println("\n[Ingrese opción a través de un valor numérico (1, 2, 3 o 4)]: ");
        int opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Secuencia numérica en bucle [for]:");

                for (int i = 10; i <= 100; i += 10) {

                    System.out.print(i);
                    if (i < 90) System.out.print(", ");
                    else if (i == 90){
                        System.out.print(" y ");
                    }else if (i == 100);
                }
                break;
            case 2:

                System.out.println("Secuencia numérica en bucle [while]:");

                while (incremento <= 100){

                    System.out.print(incremento);
                    if (incremento < 90) System.out.print(", ");
                    else if (incremento == 90){
                        System.out.print(" y ");
                    }else if (incremento == 100);
                    incremento += 10;

                }
                break;
            case 3:
                System.out.println("Secuencia numérica en bucle [do while]:");

                do {

                    System.out.print(incremento);
                    if (incremento < 90) System.out.print(", ");
                    else if (incremento == 90){
                        System.out.print(" y ");
                    }else if (incremento == 100);
                    incremento += 10;

                }while(incremento <= 100);
                break;
            case 4:
                System.out.println("Saliendo...");
                break;

        }
    }
}
