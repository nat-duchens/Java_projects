package C20240625_OOP.OOP;

public class Dog {

    private String name;
    private int age;
    private String raze;

    // Setter for name
    public void setName(String name) {
            this.name = name;

    }
        // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

        // Setter for raze
    public void setRaze(String raze) {
        this.raze = raze;
    }

    //Print method
    //Comun method
    //Voi is not necessesary for retun somthing specific
    public void printInformation() {
        System.out.println("Name: " + name + "\nAge: " + age + "\nRaze: " + raze);
    }

    public void bark(){
        System.out.println("Woof!");
    }

    public static void main(String[] args) {
        Dog dog = new Dog(); //Instantiating: communication
        dog.setName("Firulais");
        dog.setAge(10);
        dog.setRaze("Pitbull");

        dog.printInformation();
        dog.bark();
    }
}
