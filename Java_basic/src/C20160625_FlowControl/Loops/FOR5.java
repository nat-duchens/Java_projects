package C20160625_FlowControl.Loops;

public class FOR5 {
    public static void main(String[] args) {

        System.out.println("Increment");
        int addition = 0;
        int counter = 0;
        int limit = 10;

        for (int i = 2; i <= limit; i+=2) {
            System.out.println(i + " ");
            addition +=i;
            counter ++;

        }
        System.out.println("Total addition: " + addition);
        System.out.println("-".repeat(20));
    }
}
