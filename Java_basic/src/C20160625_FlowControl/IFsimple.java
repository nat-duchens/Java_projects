package C20160625_FlowControl;

public class IFsimple {
    public static void main(String[] args) {

        int age = 18;

        if (age >= 18) {
            System.out.println("Can vote");
        } else {
            System.out.println("Can't vote");
        }

    int note = 85;
    boolean attendance = true;

        if (note >= 70 && attendance) { //By default, attendance == true
            System.out.println("Approved");

        }
    }
}
