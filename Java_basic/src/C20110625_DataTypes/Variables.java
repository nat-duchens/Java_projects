package C20110625_DataTypes;

public class Variables {
    //In this class i will analyze different tips of data in Java
    //Variable is equal to a box that stores information

    /* Types of data in Java */

    /* PRIMITIVE data
     * byte
     * short
     * int
     * long
     * float
     * double
     * char
     * boolean
     * */

    //When we declare a variable in Java, first it is necessary to indicate the type of data
    //Then, we indicate the name of the variable
    byte littleNumber = 127;

    //Create a variable of each type
    byte age = 25;
    short yearBorn = 2000;
    int accountBalance = 1000000;
    long globalPopulation = 8005176000L; //Casting, remember Java consider any numeric data as an int
    float height = 1.80F; //Casting, Java consider any decimal as a double
    double pi = 3.141592;
    char nameInitial = 'Ñ'; //For characters, works with UNICODE but NO with ASCII
    boolean isAdult = true;

    //** Types of data as objects or wrapper **//
    Integer intAsObject = 400;
    String stringOfText = "Hello world";

    //** Types of special data in Java **//
    //Enum -> Defines a set of constants
    enum WeekDays {
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
    }

    //Static arrays -> Arrays that define a set of variable values
    char[] characterArray = {'H', 'O', 'L', 'A'};

    //null -> Absence of values
    String nullValue = null; //Primitive data can't be null but References data can

    //final -> reserved word that indicate that it is a constant
    final int intConstant =20;

    //** Class or static variable  **//
    //static -> a reserved word that indicates that a variable or method belongs to the class
    static String greeting = "Hi, how are you?";









}