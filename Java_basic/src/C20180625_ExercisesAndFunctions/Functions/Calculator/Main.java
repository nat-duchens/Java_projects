package C20180625_ExercisesAndFunctions.Functions.Calculator;

public class Main {

    public static void main(String[] args) {
        // Métodos estáticos de la clase Calculadora
        int resultadoSuma = Calculadora.sumar(5, 3);  // 8
        int resultadoMultiplicacion = Calculadora.multiplicar(4, 2); // 8
        int resultadoDivision = Calculadora.dividir(16, 2); // 8
        int resultadoResta = Calculadora.restar(10, 2); // 8
        int resultadoModulo = Calculadora.modulo(8, 2); // 0

        System.out.println("Resultado de la suma: " + resultadoSuma);
        System.out.println("Resultado de la multiplicación: " + resultadoMultiplicacion);
        System.out.println("Resultado de la división: " + resultadoDivision);
        System.out.println("Resultado de la resta: " + resultadoResta);
        System.out.println("Resultado del módulo: " + resultadoModulo);

        // Métodos no estáticos de la clase Usuario
        Usuario usuario1 = new Usuario("La Nico :3");
        usuario1.saludar();

    }
}