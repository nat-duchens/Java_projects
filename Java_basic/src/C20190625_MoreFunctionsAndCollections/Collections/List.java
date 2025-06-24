package C20190625_MoreFunctionsAndCollections.Collections;

import java.util.ArrayList;

public class List {

    public static void main(String[] args) {
        // DECLARACION DE LISTAS EN JAVA
        // USAMOS LA "INTERFAZ  LIST" para declarar e implementar ArrayList
        // Esto es por Flexibilidad
        java.util.List<String> frutas = new ArrayList<>();

        frutas.add("Manzana"); //0
        frutas.add("Pera");    //1
        frutas.add("Manzana"); //2

        System.out.println("Lista de Frutas:");
        //El ForEach recorre todo el arreglo en este caso la lista, elemento por elemento
        for (String fruta : frutas) {
            System.out.println("-" + fruta);
        }

        // Por ejemplo el Acceder con Get(), obtenemos el valor en este caso "Pera"
        // Obtenemos la posicion de la lista considerando siempre que comienzan en 0
        System.out.println("\nFruta en posicion 1: " + frutas.get(1) + "\n");

        // Un metodo set en list, se usa para editar y modificar
        frutas.set(1, "Uva");
        System.out.println("Modicación 1: " + frutas.get(1) + "\n");

        // un metodo para Borrar o Elimina
        frutas.remove(0);
        System.out.println("Eliminar un indice 0:" + frutas.get(0) + "\n");

        // Tamaño de una lista
        System.out.println("Tamaño de la lista: " + frutas.size());

        //Limpiar la lista
        frutas.clear();
        System.out.println("Limpiar la lista: " + frutas.isEmpty() + "\n");

        System.out.println("Nueva Lista de Frutas:");
        //El ForEach recorre todo el arreglo en este caso la lista, elemento por elemento
        for (String fruta : frutas) {
            System.out.println("-" + fruta);
        }

    }
}