package semana5.EjerciciosIF;

public class EjemploOperadorTernario2 {

    public static void main(String[] args) {

        int numero = 3;
        String resultado = (numero % 2 == 0) ? "Par" : "Impar";
        System.out.println("El número " + numero + " es " + resultado);

         // Alternativa 
        System.out.println("El número " + numero + " es " + ((numero % 2 == 0) ? "Par" : "Impar"));
    }
}
