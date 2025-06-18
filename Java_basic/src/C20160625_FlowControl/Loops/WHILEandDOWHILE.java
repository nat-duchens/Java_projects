package C20160625_FlowControl.Loops;

public class WHILEandDOWHILE {
    public static void main(String[] args) {
        int i = 0;
        // while evalua una condicion en este caso que i sea menor a 10 si es menor lo ejecuta
        // por lo tanto while quiere decir que es pre-evaluacion es como un for ejecta algo mientras se cumpla una condicion
        // considerar que i empieza desde el 0 por lo tanto el i final es 9
        // las condicion del while deve ser booleana. ya que evalua si es verdadero o falso. si es while entra al while
        while (i < 10){
            System.out.println((i));
            i++;

        }
        i=0;
        boolean condicion = true;
        do{
            // ejecuta este codigo mientras condicion sea verdadero  si pasa a false pasa al codigo bajo el while
            if(i == 5) {
                //luego de 5 vueltas pasa condicion a  false
                condicion = false;
            }
            System.out.println("esto se ejecuta al menos una sola ves  y llevamos " + i);
            i++;
            // este codigo se ejecuta al menos una vez. luego evalua la condicion del while si es verdadero pasa el while
        }while(condicion);
        System.out.println("se cumple la condicion y ahora se ejecuta el codigo bajo el while");
    }

}