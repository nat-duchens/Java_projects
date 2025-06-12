package C20120625;

import java.util.Scanner;

public class OperadoresAsignacion { //Acá se define un scope de clase

    //Main va a ser el punto de entrada a este programa
    public static void main(String[] args) { //Acá se define un scope local o de función
        //Operadores de asignación//
        /*
         *  = -> asignación
         *  += -> suma el valor y asigna el resultado
         *  -= -> resta el valor y asigna el resultado
         *  *= -> multiplica por el valor y asigna el resultado
         *  /= -> divide entre otro valor y asigna el resultado
         *  ++ -> incremento, suma +1 al valor actual de la variable
         *  -- -> decremento, resta -1  al valor actual de la variable
         * */

        //Variables a través de consola
        Scanner teclado = new Scanner(System.in);

        //1. Pedimos el primer número
        System.out.println("Indica el primer número");
        int numeroUno = teclado.nextInt();

        //2. Pedimos el segundo número
        System.out.println("Indica el segundo número");
        int numeroDos = teclado.nextInt();

        //3. Imprimimos ambos números
        System.out.println("El primer número es: " + numeroUno + " y el segundo número es: " + numeroDos);

        //4. Realizamos las distintas asignaciones, con los números 5 y 7
        System.out.println(numeroUno += numeroDos); //numeroUno(5) ahora equivale a 12
        System.out.println(numeroUno -= numeroDos); //numeroUno(12) ahora equivale a 5
        System.out.println(numeroUno *= numeroDos); //numero(5) ahora equivale a 35
        System.out.println(numeroUno /= numeroDos); //numero(35) ahora equivale a 5

        System.out.println("Ahora el primer número equivale a: " + numeroUno);

        /** INCREMENTO Y DECREMENTO **/

        System.out.println("Al realizar un preincremento, numeroUno equivale a " + ++numeroUno);//numeroUno(5) ahora equivale a 6
        System.out.println("Al realizar un posincremento, numeroUno equivale a " + numeroUno++);//numero(7) pero no se vuelve a llamar a esta variable
        //System.out.println("Ahora el primer numero equivale a: " + numeroUno);
        System.out.println("Al realizar un predecremento, numeroDos equivale a " + --numeroDos);//numeroDos(7) ahora equivale a 6
        System.out.println("Al realizar un posdecremento, numeroDos equivale a " + numeroDos--);//numeroDos(5) pero no se vuelve a llamar a esta variable

    }
}