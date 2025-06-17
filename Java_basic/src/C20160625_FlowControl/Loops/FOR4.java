package C20160625_FlowControl.Loops;

public class FOR4 {
    public static void main(String[] args) {

        System.out.println("Pair addition");

        int limit = 10;
        int addition = 0;
        int counter = 0;

        System.out.println("Pair numbers from 1 to " + limit + " : ");

        for (int i = 1; i <= limit; i++){
            if (i % 2 == 0) {
                System.out.println(i + " ");
                addition += i; //Assignment operator or accumulator -> addition = addition + i
                counter ++;

            }

        }
        System.out.println("\nThe amount of pair numbers are " + counter);
        System.out.println("The addition of the pair numbers are  " + addition);
        System.out.println("Average of pair numbers is " + (addition/(double) counter));
    }
}
