package animals;

import models.Animal;

public class Dog extends Animal { //Subclass, extends from Animal Class
    //Constructor
    public Dog(String name, String type, int age) {
        super(name, type, age); //super -> keyword serves to reference the immediate parent class object
    }

    //Overwrite method to make a specific sound
    //Generate -> Override methods...
    @Override
    public void sound() {
        System.out.println(name + " \uD83D\uDC36: Woof Woof!");
    }
}
