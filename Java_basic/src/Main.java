import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
//Class system and print method, allows us to print in the console

        //for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            //System.out.println("i = " + i);
        //}
    //Create and instance (create a variable) of the class scanner, that allow us to add data to the console
        Scanner keyboard =  new Scanner(System.in);
    //Tell the user to add their name
        System.out.println("Enter your name: ");
    //Save the name in a variable and then print it
        String name = keyboard.nextLine();
    //Concatenate "Hello" with the variable name
        System.out.println("Hola, " + name);

     }
}