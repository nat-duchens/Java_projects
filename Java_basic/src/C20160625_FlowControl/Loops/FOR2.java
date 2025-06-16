package C20160625_FlowControl.Loops;

public class FOR2 {
    public static void main(String[] args) {

        System.out.println("Multiplication tables");

        int tableNumber = 4;

        for (int i = 0; i <= 10; i++){
            int result = tableNumber * i;
            System.out.printf("%d x %d = %d%n", tableNumber, i, result);
        }

        System.out.println();

    }
}
