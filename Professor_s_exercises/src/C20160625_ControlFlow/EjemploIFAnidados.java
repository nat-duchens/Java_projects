package semana5.EjerciciosIF;

public class EjemploIFAnidados {
    public static void main(String[] args) {

        boolean usuario = true;
        boolean password = true;
        boolean activo = false;

        if (activo){
            if(password){
                if(usuario){
                    System.out.println("Bienvenido");
                }else{
                    System.out.println("Cuenta Inactiva");
                }
            }else {
                System.out.println("Password correctamente");
            }
        }else{
            System.out.println("Ingrese correctamente");
        }


    }
}
