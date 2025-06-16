package C20160625_FlowControl;

public class IFNested2 {
    public static void main(String[] args) {

        int age = 20;
        double average = 8.5;
        boolean scholarship = true;

        if (age >= 18) {
            System.out.println("University student");

            if (average >= 6.5) {
                System.out.println("Super featured");
            } else if (average >= 6.0) {
                System.out.println("Featured");
            } else {
                System.out.println("Discarded");
            }

            if (scholarship) {
                System.out.println("Scholarship recipient");
            } else {
                System.out.println("No scholarship");
            }
        }
    }
}