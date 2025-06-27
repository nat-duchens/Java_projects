package animals;

import models.Animal;

public class Cat extends Animal {//Subclass, extends from Animal Class

    //Constructor
    public Cat(String name, String type, int age) {
        super(name, type, age); //super -> keyword serves to reference the immediate parent class object
    }

    //Overwrite method to make a specific sound
    //Generate -> Override methods...
    @Override
    public void sound() {
        System.out.println(name + " \uD83D\uDC31: Miau Maiu!");
    }
}