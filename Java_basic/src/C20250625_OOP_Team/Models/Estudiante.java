package C20250625_OOP_Team.Models;

public class Estudiante {

    String nombre;
    String apellido;
    int calificacionUno;
//    int calificacionDos;
//    int calificacionTres;
//    int calificacionCuatro;
    int identificadorRut;

    //Constructor
    public Estudiante(String nombre, String apellido, int calificacionUno, int calificacionDos, int calificacionTres, int calificacionCuatro, int identificadorRut) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.calificacionUno = calificacionUno;
//        this.calificacionDos = calificacionDos;
//        this.calificacionTres = calificacionTres;
//        this.calificacionCuatro = calificacionCuatro;
        this.identificadorRut = identificadorRut;

    }

    //Get
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

//    public int getCalificacionUno() {
//        return calificacionUno;
//
//    }

    public int getIdentificadorRut() {
        return identificadorRut;
    }

    public String nombreCompleto() {
        return nombre + " " + apellido;
    }

    //Set
    public void setCalificacionUno(int calificacionUno) {
        this.calificacionUno = calificacionUno;
    }
}




