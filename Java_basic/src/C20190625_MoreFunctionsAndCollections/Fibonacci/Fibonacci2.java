package C20190625_MoreFunctionsAndCollections.Fibonacci;

import java.util.Scanner;

public class Fibonacci2 {
    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        int n;

        // Bucle que asegura que el número sea mayor que 0
        do {
            System.out.print("Introduce N (mayor que 0): ");
            n = keyBoard.nextInt();
            if (n <= 0) {
                System.out.println("Por favor, introduce un número válido.");
            }
        } while (n <= 0);

        // Mostrar la sucesión de Fibonacci
        System.out.print("Sucesión de Fibonacci: ");
        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }

        keyBoard.close();
    }
}

