package semana5.EjerciciosIF;

public class EjemploELFE3 {
    public static void main(String[] args) {

        String user = "admin";
        String password = "<PASSWORD>";
        // and deben cumplir ambas condiciones
        // concion1 ok por quees igual al user
        // condicion2 KO por q no es la misma contraseña
        // or se debe cumplir al menos 1 una condicion
        if ( user.equals("admin") || password.equals("123")){
            System.out.println("Bienvenido");
        }else{
            System.out.println("Ingrese correctamente");
        }



    }
}
