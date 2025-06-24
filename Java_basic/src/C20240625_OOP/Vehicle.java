package C20240625_OOP;

public class Vehicle {

    String type;
    int wheels;
    String colour;

    public void go() {
        System.out.println("Going!");

    }

    class car {
        public static void main(String[] args) {
            Vehicle v = new Vehicle();

            v.type = "car";
            v.wheels = 4;
            v.colour = "red";

            System.out.println("Type of vehicle: " + v.type);
            System.out.println("Wheels" + v.wheels);
            System.out.println("Vehicle colour: " + v.colour);
        }
    }
}
