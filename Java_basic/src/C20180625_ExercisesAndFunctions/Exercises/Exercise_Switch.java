package C20180625_ExercisesAndFunctions.Exercises;
/*
Desarrolla un programa en Java que imprima la siguiente secuencia numérica:

10, 20, 30, 40, 50, 60, 70, 80, 90 y 100

Debes implementar la solución de tres maneras diferentes:

1. Utilizando un bucle for
2. Utilizando un bucle while
3. Utilizando un bucle do-while

Observación importante:

 - El último número (100) debe estar precedido por la conjunción "y" en lugar de una coma (,).
 - El formato de salida debe ser exactamente como se muestra en el ejemplo.


*/
import java.util.Scanner;

public class Exercise_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ DE BUCLES ---");
            System.out.println("1. Usar for");
            System.out.println("2. Usar while");
            System.out.println("3. Usar do-while");
            System.out.println("4. Salir");
            System.out.print("Elige una opción (1-4): ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("\nSecuencia con for:\n10");
                    for (int i = 20; i <= 100; i += 10) {
                        System.out.print(i == 100 ? " y " + i : ", " + i);
                    }
                    break;
                case 2:
                    System.out.print("\nSecuencia con while:\n10");
                    int j = 20;
                    while (j <= 100) {
                        System.out.print(j == 100 ? " y " + j : ", " + j);
                        j += 10;
                    }
                    break;
                case 3:
                    System.out.print("\nSecuencia con do-while:\n10");
                    int k = 20;
                    do {
                        System.out.print(k == 100 ? " y " + k : ", " + k);
                        k += 10;
                    } while (k <= 100);
                    break;
                case 4:
                    System.out.println("\n¡Hasta luego!");
                    break;
                default:
                    System.out.println("\nOpción inválida. Intenta de nuevo.");
            }

        } while (opcion != 4);
        scanner.close();
    }
}