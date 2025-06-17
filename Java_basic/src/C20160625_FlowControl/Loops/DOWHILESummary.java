package C20160625_FlowControl.Loops;

public class DOWHILESummary {
    public static void main(String[] args) {

        int number = 10;
        do{
            System.out.println("This message is only seen once");
            number++;
        }while (number < 10); //Te condition is false from the beginning
    }
}
