package semana5.EjerciciosIF;

public class EjemploIFAnidado3 {
    public static void main(String[] args) {
        boolean esCliente = true;
        int tiempoCliente = 3; // años
        double montoCompra = 1500.0;

        if (esCliente) {
            if (tiempoCliente >= 5) {
                if (montoCompra >= 1000) {
                    System.out.println("Descuento VIP: 20%");
                } else {
                    System.out.println("Descuento cliente antiguo: 15%");
                }
            } else if (tiempoCliente >= 1) {
                if (montoCompra >= 500) {
                    System.out.println("Descuento cliente: 10%");
                } else {
                    System.out.println("Descuento básico: 5%");
                }
            } else {
                System.out.println("Cliente nuevo: Sin descuento");
            }
        } else {
            System.out.println("Regístrese para obtener descuentos");
        }
    }
}
