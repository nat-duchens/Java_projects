package C20110625_DataTypes;

public class Variables {
    //En esta clase vamos a analizar los distintos tipos de dato en Java
    //Una variable equivale a una cajita para almacenar información

    /**
     * TIPOS DE DATO EN JAVA
     **/

    /* DATOS PRIMITIVOS -> Forman parte del lenguaje
     *  - byte
     *  - short
     *  - int
     *  - long
     *  - float
     *  - double
     *  - char
     *  - boolean
     * */

    //Cuando declaramos una variable en Java, primero indicamos el tipo de dato
    //Luego, indicamos el nombre de la variable
    byte numeroPequeno = 127;

    //Creamos una variable de cada tipo numérico, Java trata a los datos de tipo numérico como int
    byte edad = 20;
    short anioNacimiento = 2005;
    int balanceCuenta = 1000000;
    long poblacionMundial = 8005176000L; //Casteo es convertir un tipo de dato a uno de mayor tamaño

    //Java trata a los tipos de dato decimales como double
    float estatura = 1.80F;
    double pi = 3.141592;

    //Char para caractéres, trabaja con UNICODE no ASCII
    char inicialNombre = 'Z';

    //Boolean, almacena valores de verdaro o falso
    boolean esMayorDeEdad = false;

    /**** DATOS DE TIPO OBJETO O WRAPPER ****/
    Integer enteroDeTipoObjeto = 400;
    String cadenaDeTexto = "Hola mundo";

    /*** TIPOS DE DATO ESPECIALES EN JAVA ***/
    //Enum -> Define un conjunto de constantes
    enum DiasDeLaSemana {
        LUNES,
        MARTES,
        MIERCOLES,
        JUEVES,
        VIERNES
    }

    //Arrays estático -> Arreglos que definen un conjunto de valores variables
    char[] arregloDeCaracteres = {'H', 'O', 'L', 'A'};

    //null -> Ausencia de un valor
    String valorNulo = null;

    /*** CONSTANTES EN JAVA ***/
    //final -> Palabra reservada que indica que es una constante
    final int constanteEntero = 20;

    /**
     * VARIABLE DE CLASE O ESTÁTICA
     **/
    //static -> Palabra reservada que indica que una variable o método le pertenece a la clase
    static String saludo = "Hola, ¿cómo estás?";

}