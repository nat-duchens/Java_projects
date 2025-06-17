package C20160625_FlowControl.Loops;

public class DOWHILESummary2 {
    public static void main(String[] args) {

        int option = 0;
        do{
            System.out.println("1. Go out");
            System.out.println("2. Add");
            System.out.println("3. Delete");
            System.out.println("4. List");
            System.out.println("5. Search");
            System.out.println("");

            option = (int)(Math.random() * 5) +1;
            System.out.println("Option selected: "+ option);
            if (option == 1){
                System.out.println("Go out...");
            } else if (option == 2) {
                System.out.println("Add");

            }else {
                System.out.println("Option not valid");
            }

        }while ((option != 3));

    }
}
