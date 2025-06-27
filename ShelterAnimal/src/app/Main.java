package app;

import animals.Cat;
import animals.Dog;
import models.Animal;

public class Main {
    public static void main(String[] args) {

        //Create and Object
        Animal animal1 = new Animal("Animal", "Dog", 5);
        animal1.showInformation();
        animal1.sound();

        /*
         * OUT:
         * Name: Animal
         * Type: Dog
         * Age: 5 years
         * Animal makes a generic sound.
         */
        System.out.println("\n---\n");

        //Create a Cat object
        Cat cat1 = new Cat("Stinky", "Cat", 2);
        cat1.showInformation(); //Heritage method
        cat1.sound(); //Overwrite method

        /*
         * Salida esperada:
         * Name: Stinky
         * Type: Cat
         * Age: 2 years
         * Stinky 🐱: Miau Miau!
         */

        System.out.println("\n---\n");

        Dog dog1 = new Dog("Leo", "Dog", 10);
        dog1.showInformation();
        dog1.sound();

    }
    //  Clear inheritance: Dog and Cat inherit from Animal
    //  Code reuse with the parent constructor via super()
    //  Access to attributes via -> protected (Protected encapsulation)
    //  Polymorphism via overridden methods (sound)
    //  Code reuse using -> extends
}