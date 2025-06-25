package C20250625_OOP_Team.Models;

import java.util.HashMap;
import java.util.Map;

public class Prueba {
    public static void main(String[] args) {
        Map<String, Integer> gestorDeNotas = new HashMap<>();
        gestorDeNotas.put("notaUno", 60);
        gestorDeNotas.put("notaDos", 50);
        gestorDeNotas.put("notaTres", 70);
        gestorDeNotas.put("notaCuatro", 40);
        System.out.println("las notas del semestree: " + gestorDeNotas);
        int notaMatematicas = gestorDeNotas.get ("notaUno");
        System.out.println("Nota de matematicas: " + notaMatematicas);
        int notaLenguaje = gestorDeNotas.get("notaDos");
        System.out.println("Nota de lengauje : " + notaLenguaje);
        int notaHistoria = gestorDeNotas.get("notaTres");
        System.out.println("Nota de Historia: " + notaHistoria);
        int notaQuimica = gestorDeNotas.get("notaCuatro");
        System.out.println("Nota de Quimica: " + notaQuimica);




    }
}
