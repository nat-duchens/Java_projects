package C20190625_MoreFunctionsAndCollections.Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

    public static void main(String[] args) {
        // Crear un HashSet de enteros
        Set<Integer> conjuntoNumeros = new HashSet<>();

        // Agregar elementos al HashSet
        conjuntoNumeros.add(5);
        conjuntoNumeros.add(10);
        conjuntoNumeros.add(15);
        conjuntoNumeros.add(10); // Elemento duplicado (no tiene efecto)

        // Imprimir el HashSet
        System.out.println("HashSet de números: " + conjuntoNumeros);

        // Verificar si un elemento está presente
        boolean contieneElemento = conjuntoNumeros.contains(15);
        System.out.println("¿Contiene 15? " + contieneElemento);

        // Eliminar un elemento
        conjuntoNumeros.remove(10);
        System.out.println("HashSet después de eliminar 10: " + conjuntoNumeros);

        // Tamaño del HashSet
        int tamanoHashSet = conjuntoNumeros.size();
        System.out.println("Tamaño del HashSet: " + tamanoHashSet);

        // Limpiar el HashSet
        conjuntoNumeros.clear();
        System.out.println("HashSet después de limpiar: " + conjuntoNumeros);
    }
}