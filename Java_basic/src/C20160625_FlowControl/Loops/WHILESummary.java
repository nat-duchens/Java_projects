package C20160625_FlowControl.Loops;

public class WHILESummary {
    public static void main(String[] args) {

//        int counter = 0;
//        while (counter <= 3){
//            System.out.println("Attempt: " + counter);
//            counter++;

            int secretNumber = 7;
            int attempts = 0;
            boolean guess = false;

            while (!guess){
                attempts++;
                int myNumber = (int)(Math.random() * 10) +1;
                System.out.println("Attempt " + attempts + " -> The secret number is: " + myNumber);
                if (myNumber == secretNumber){
                    guess = true;
                    System.out.println("You guess in " + attempts + " attempts!");
                }
        }
    }
}