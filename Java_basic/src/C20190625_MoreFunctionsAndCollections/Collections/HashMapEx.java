package C20190625_MoreFunctionsAndCollections.Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

    public static void main(String[] args) {
        // Crear un HashMap de cadenas a enteros
        Map<String, Integer> mapaCadenasEnteros = new HashMap<>();

        // Agregar pares clave-valor al mapa
        mapaCadenasEnteros.put("Uno", 1);
        mapaCadenasEnteros.put("Dos", 2);
        mapaCadenasEnteros.put("Tres", 3);

        // Imprimir el mapa
        System.out.println("Mapa de cadenas a enteros: " + mapaCadenasEnteros);

        // Acceder a un valor por clave
        int valorDos = mapaCadenasEnteros.get("Dos");
        System.out.println("Valor asociado a 'Dos': " + valorDos);

        // Verificar si una clave está presente
        boolean contieneClave = mapaCadenasEnteros.containsKey("Cuatro");
        System.out.println("¿Contiene 'Cuatro'? " + contieneClave);

        // Eliminar un par clave-valor
        mapaCadenasEnteros.remove("Uno");
        System.out.println("Mapa después de eliminar 'Uno': " + mapaCadenasEnteros);

        // Tamaño del mapa
        int tamanoMapa = mapaCadenasEnteros.size();
        System.out.println("Tamaño del mapa: " + tamanoMapa);

        // Limpiar el mapa
        mapaCadenasEnteros.clear();
        System.out.println("Mapa después de limpiar: " + mapaCadenasEnteros);
    }
}