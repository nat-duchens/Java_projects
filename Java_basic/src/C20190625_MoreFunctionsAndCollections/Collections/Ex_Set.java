package C20190625_MoreFunctionsAndCollections.Collections;

import java.util.HashSet;
import java.util.Set;

public class Ex_Set {
    public static void main(String[] args) {

        // Declaramos un Set
        Set<String> paises = new HashSet<>();

        //Agregar
        paises.add("Chile");
        paises.add("Peru");
        // paises.add("Chile"); // Duplicado
        paises.add("Argentina");

        System.out.println("Paises en el set:");
        for (String pais : paises){
            System.out.println("-" + pais);
        }

        //Remove para eliminar
        paises.remove("Argentina");
        System.out.println("\nPaises en el set:");
        for (String pais : paises){
            System.out.println("-" + pais);
        }

        //Tamaño
        System.out.println("Tamaño Set: " + paises.size());

        // Limpiar
        paises.clear();
        System.out.println("Esta Vacio? " + paises.isEmpty());

    }
}
