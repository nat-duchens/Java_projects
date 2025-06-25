package C20250625_OOP_Team.Models;

import java.util.HashMap;
import java.util.Map;

public class GestorNotas {

    // Dentro de esta clase, implementa un `Map<Integer, Estudiante>` llamado `estudiantes`.
    Map<Integer, Estudiante> estudiantes = new HashMap<>();
    int calificaciones;;

    public void Estudiante(){

        String nombreEstudiante;

    }


//    ## Métodos a implementar:##
// - `void agregar(Estudiante e)`: Agrega un estudiante al mapa.
    public void agregar(Estudiante estudiante_e){
        estudiantes.put(estudiante_e.getIdentificadorRut(), estudiante_e); //Revisarlo
        //.put para agregar o actualizar un valor usando una clave -> put(key, value)
       //.get para recuperar el valor asociado a una clave -> get(object key)
       //HasMap -> para almacenar pares "key-value" como en una función xy
        System.out.println("Estudiante" + estudiante_e.nombreCompleto() + "ha sido agregado");
    }

//- `void actualizarNota(int matricula, int nuevaNota)`: Modifica la calificación de un estudiante.
//    public void actualizarNota(int IdentificadorRut, int calificacionDos){


    }





// - `void mostrarNota(int matricula)`: Muestra la nota actual del estudiante.
//    public void mostrarNota(int IdentificadorRut){
//    }

