package C20180625_ExercisesAndFunctions.Functions.Calculator;

public class Calculadora {

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: División por cero");
            return 0;
        }

        return a / b;
    }

    public static int restar(int a, int b) {

        return a - b;
    }

    public static int modulo(int a, int b) {

        return a % b;
    }
}