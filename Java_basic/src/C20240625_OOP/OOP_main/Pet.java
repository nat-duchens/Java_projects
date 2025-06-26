package C20240625_OOP.OOP_main;

import C20240625_OOP.OOP.Dog;

public class Pet {

public static void main(String[] args) {

    Dog miDog = new Dog(); //Instatiating -> functions as a comunicator

    miDog.setName("Rocky");
    miDog.setRaze("Golden");
    miDog.setAge(4);

    miDog.bark();
    miDog.printInformation();
        }
    }

