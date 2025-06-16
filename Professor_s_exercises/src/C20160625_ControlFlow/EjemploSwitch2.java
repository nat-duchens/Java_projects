package semana5.EjerciciosIF;

public class EjemploSwitch2 {

    public static void main(String[] args) {
        String nombre = "Constanza";

        switch (nombre.toLowerCase()) {
            case "Mario":
                System.out.println("Letra A");
                break;
            case "constanza":
                System.out.println("Letra B");
                break;
            case "Constanza":
                System.out.println("Letra C");
                break;
            default:
                System.out.println("No es una letra valida");
                break;
        }
    }
}


