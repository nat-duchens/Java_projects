package semana5.EjerciciosIF;

public class EjemploAnidado2 {
    public static void main(String[] args) {

        int edad = 20;
        double promedio = 6.0;
        boolean becado = true;

        if (edad >= 18) {
            System.out.println("Estudiante Universitario");

            if (promedio >= 6.0) {
                System.out.println("Destacado");
                if (becado) {
                    System.out.println("Becado");
                } else {
                    System.out.println("No Becado");
                }
            } else if (promedio >= 6.5) {
                System.out.println("Super Destacado");
            } else {
                System.out.println("Destacado");
            }
        }
    }
}
