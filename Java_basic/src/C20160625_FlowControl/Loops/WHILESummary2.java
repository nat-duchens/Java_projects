package C20160625_FlowControl.Loops;

public class WHILESummary2 {
    public static void main(String[] args) {

        double balance = 1000.0;
        int day = 1;
        while (balance > 0 && day <= 30){
            double daySpent = Math.random() * 100;
            balance = balance - daySpent;
            System.out.println("Day " + day + ": You spent " +
                    String.format("%.2f", daySpent) +
                    " -> Balance: $" + String.format("%.2f", balance));
        }
    }
}
