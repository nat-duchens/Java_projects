package C20120625;

import java.util.Scanner;

public class OperadoresComparacion {

    public static void main(String[] args) {
        //Los operadores de comparación tienen como resultado un boolean
        /*
         *  ==   -> Igual que
         *  >    -> Mayor que
         *  >=   -> Mayor o igual que
         *  <    -> Menor que
         *  <=   -> Menor o igual que
         *  !=   -> Es distinto de
         *
         * */

        //Variables a través de consola
        Scanner teclado = new Scanner(System.in);

        //1. Definimos nuestras variables para comparar, a través del input por consola
        System.out.println("Indica el primer número");
        int numeroUno = teclado.nextInt();
        System.out.println("Indica el segundo número");
        int numeroDos = teclado.nextInt();
        teclado.nextLine();//Me va a permitir detectar la siguiente línea de consola

        System.out.println("Ahora indica la primera palabra");
        String palabraUno = teclado.nextLine();
        /**String palabraUno = JOptionPane.showInputDialog(null, "Ahora indica la primera palabra");**/
        System.out.println("Ahora indica la segunda palabra ");
        String palabraDos = teclado.nextLine();

        //System.out.println(numeroUno + " - " + numeroDos + " - " + palabraUno + " - " + palabraDos);

        //2. Generamos expresiones de comparación para obtener un boolean, utilizando los operadores
        //Expresiones para comparar números
        System.out.println("¿numeroUno es igual a numeroDos? = " + (numeroUno == numeroDos));//Expresión se evalúa primero y el resultado se concatena
        System.out.println("¿numeroUno es mayor a numeroDos? = " + (numeroUno > numeroDos));
        System.out.println("¿numeroUno es menor a numeroDos? = " + (numeroUno < numeroDos));
        System.out.println("¿numeroUno es distinto de numeroDos? = " + (numeroUno != numeroDos) + "\n");

        //Expresiones para comparar palabras
        System.out.println("comparamos ambas variables String con el operador de igualdad y obtenemos = " + (palabraUno == palabraDos));
        System.out.println("comparamos ambas variables String con el método de la clase String .equals() y obtenemos = " + palabraUno.equals(palabraDos));
    }

}