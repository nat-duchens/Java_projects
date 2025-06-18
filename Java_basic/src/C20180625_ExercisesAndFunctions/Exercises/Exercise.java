package C20180625_ExercisesAndFunctions.Exercises;

public class Exercise {
    public static void main(String[] args) {

        /*Desarrolla un programa en Java que imprima la siguiente secuencia numérica: 10, 20, 30, 40, 50, 60, 70, 80, 90 y 100
        Debes implementar la solución de tres maneras diferentes:
        1.Utilizando un bucle for
        2.Utilizando un bucle while
        3.Utilizando un bucle do-while*/

        System.out.println("For loop");

        int limit = 100;

        for (int i = 10; i <= limit; i+=10) {

            if (i == limit) {
                System.out.print(" y " + i);
            } else if (i == limit - 10) { // i == 90
                System.out.print(i);
            } else {
                System.out.print(i + ", " );
            }

        }

        System.out.println(" ");
        System.out.println("While loop");

        int a = 10;

        while (a <= limit){
            if (a == limit) {
                System.out.print(" y " + a);
            } else if (a == limit - 10) {
                System.out.print(a);
            } else {
                System.out.print(a + ", ");
            }
            a+= 10;
        }

        System.out.println(" ");
        System.out.println("Do-While loop");

        a = 10; //Reboot the value

        do{
            if (a == limit) {
                System.out.print(" y " + a);
            } else if (a == limit - 10) {
                System.out.print(a);
            } else {
                System.out.print(a + ", ");
            }
            a+= 10;

        } while (a <= limit);


    }

}
