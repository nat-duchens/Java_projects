package models;

public class Animal { //Father Class, represents a generic animal

    //Common attributes for any animal
    protected String name;
    protected String type;
    protected int age;

    //Constructor -> special method used to initialize objects of a class

    public Animal(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    //Method to show information
    public void showInformation() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Age: " + age + " years");
    }

    //Generic method that can be overwritten
    public void sound(){
        System.out.println(name + " makes a generic sound");
    }
}