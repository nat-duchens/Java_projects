package C20190625_MoreFunctionsAndCollections.Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

//      Intento con Nat y Nico:

//        1. El programa pide al usuario un número entero N (mayor que 0).
//        2. Muestra los N primeros números de la sucesión de Fibonacci, separados por espacios.
//         Introduce N: 7
//                Sucesión de Fibonacci: 0 1 1 2 3 5 8
//
//        Scanner keyBoard = new Scanner(System.in);
//
//        // F(n) = F(n-1) + F(n-2) for n > 1.
//
//            System.out.println("Indica el número 7");
//            int numero = keyBoard.nextInt();
//
//            if (numero = 0) {
//                System.out.println(" ");
//            } else if ( ) {
//                System.out.println("T");

        // ***** Solución: ******//

        Scanner keyBoard = new Scanner(System.in);

        // F(n) = F(n-1) + F(n-2) for n > 1.

        System.out.print("Introduce Número: ");
        int n = keyBoard.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, introduce un número entero mayor que 0.");
                } else {
                    System.out.print("Sucesión de Fibonacci: ");

                    int a = 0;
                    int b = 1;

                    for (int i = 0; i < n; i++) {
                        System.out.print(a + " ");
                        int siguiente = a + b;
                        a = b;
                        b = siguiente;
                    }
                }

                keyBoard.close();
            }
        }