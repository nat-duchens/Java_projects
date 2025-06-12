package C20110625;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Creamos una instancia de la clase Variables -> Esta instancia ahora ocupa un espacio en memoria
        Variables variables = new Variables();
        Scanner miScanner = new Scanner(System.in);

        //Instanciar un objeto equivale a asignarle un espacio en memoria
        //Esto sucede al crear una variable a partir de una clase

        //Accedemos a las variables que creamos anteriormente
        //Variables de instancia -> Necesitan que se cree una variable con el tipo de dato para ser accesibles
        System.out.println("Hola, mi edad es " + variables.edad);

        //Variables de clase -> No necesitan que se cree una variable, necesitan que se indique la palabra static
        System.out.println(Variables.saludo);
        System.out.println("Hoy es " + Variables.DiasDeLaSemana.MIERCOLES);

        //Probamos operaciones aritméticas
        Operadores operadores = new Operadores();

        System.out.println("******* Desde acá comenzamos a probar operaciones aritméticas *****");
        System.out.println("El resultado de la suma es -> " + operadores.resultadoSuma);
        System.out.println("El resultado de la resta es -> " + operadores.resultadoResta);
        System.out.println("El resultado de la multiplicación es -> " + operadores.resultadoMultiplicacion);
        System.out.println("El resultado de la división es -> " + operadores.resultadoDivision);
        System.out.println("El resto de la división es -> " + operadores.restoDivision);
    }
}