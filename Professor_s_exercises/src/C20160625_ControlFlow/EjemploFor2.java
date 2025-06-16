package semana5.EjerciciosBucles;

public class EjemploFor2 {

    public static void main(String[] args){

        System.out.println("Tablas de Multiplicar");

        int numeroDeTablas = 4;

        for(int i = 0; i <=10 ; i++ ){
            int resultado =  numeroDeTablas * i;
            System.out.printf("%d x %d = %d%n", numeroDeTablas, i, resultado);
        }

        System.out.println();

    }
}
