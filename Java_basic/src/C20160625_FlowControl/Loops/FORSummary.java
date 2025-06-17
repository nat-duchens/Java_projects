package C20160625_FlowControl.Loops;

public class FORSummary {
    public static void main(String[] args) {

        //For simple structure
        //for (int i = 1; i <= 5; i++ ){
        //    System.out.println("Number: " + i);

        for (int table = 1; table <= 10; table++){
            //First loop print 1
            System.out.println("------ Table of " + table + " ------");
            for (int multiplication = 1; multiplication <= 10; multiplication++){
                int result = table * multiplication;
                System.out.println(table + " x " + multiplication + " = " + result);
            }
            System.out.println("");

        }
    }
}