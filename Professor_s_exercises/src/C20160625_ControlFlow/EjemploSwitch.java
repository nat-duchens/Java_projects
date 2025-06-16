package semana5.EjerciciosIF;

public class EjemploSwitch {

    public static void main(String[] args) {

        int dia = 5;
        String nombreDia;

        switch (dia) {
            case 1: nombreDia = "Lunes";
            break;

            case 2: nombreDia = "Martes";
            break;

            case 3: nombreDia = "Miercoles";
            break;

            default: nombreDia = "No definido";
            break;
        }

        System.out.println("hoy es : " + nombreDia);
    }
}
