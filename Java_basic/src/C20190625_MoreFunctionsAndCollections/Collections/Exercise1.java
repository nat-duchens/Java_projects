package C20190625_MoreFunctionsAndCollections.Collections;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Exercise1 {

    public static void main(String[] args) {

    // 1. ArrayList para almacenar nombres de personajes
    ArrayList<String> personajes = new ArrayList<>();
        personajes.add("Eleven");
        personajes.add("Mike");
        personajes.add("Dustin");
        personajes.add("Lucas");
        personajes.add("Max");

    // 2. HashSet para almacenar habilidades únicas
    HashSet<String> habilidades = new HashSet<>();
        habilidades.add("Telequinesis");
        habilidades.add("Liderazgo");
        habilidades.add("Inteligencia");
        habilidades.add("Habilidad con la honda");
        habilidades.add("Patinaje");

    // 3. HashMap para asociar personajes con su habilidad principal
    HashMap<String, String> personajeHabilidad = new HashMap<>();
        personajeHabilidad.put("Eleven", "Telequinesis");
        personajeHabilidad.put("Mike", "Liderazgo");
        personajeHabilidad.put("Dustin", "Inteligencia");
        personajeHabilidad.put("Lucas", "Habilidad con la honda");
        personajeHabilidad.put("Max", "Patinaje");

    // Mostrar información inicial
        System.out.println("Personajes: " + personajes);
        System.out.println("Habilidades únicas: " + habilidades);
        System.out.println("Personajes con sus habilidades: " + personajeHabilidad);

        /*
         * ### Instrucciones a considerar:
         *
         * 1. **Realizar las siguientes operaciones:**
         *     - Agregar un nuevo personaje al ArrayList y al HashMap
         *     - Eliminar a Dustin del ArrayList y del HashMap
         *     - Buscar la habilidad de Max
         *     - Verificar si una habilidad existe en el HashSet
         * */

        System.out.println(" ");
        System.out.println("Lo que nosotros hicimos: ");

        personajes.add("Vecna");  // Agregar un nuevo personaje al ArrayList
        personajes.remove(2); // Eliminar a Dustin
        System.out.println("Añadimos a Vecna y eliminamos a Dustin!!");

        habilidades.add("Cazar");
        habilidades.remove("Inteligencia");
        System.out.println("Añadimos la habilidad de cazar, removimos la habilidad de Inteligencia!!");


        personajeHabilidad.put("Vecna", "Cazar"); // Agregar un nuevo personaje HashMap
        personajeHabilidad.remove("Dustin");
        System.out.println("Añadimos a Vecna y su habilidad!!");
        System.out.println("Eliminamos a Dustin y su habilidad!!");

        System.out.println(" ");
        System.out.println("Personajes: " + personajes);
        System.out.println("Habilidades únicas: " + habilidades);
        System.out.println("Personajes con sus habilidades: " + personajeHabilidad);

        System.out.println("La habilidad de Max es: " + personajeHabilidad.get("Max")); // Buscar la habilidad de Max
        System.out.println("HashSet contiene: " + habilidades.contains("Cazar")); // Verificar si una habilidad existe

    }


}
