package C20190625_MoreFunctionsAndCollections.Collections;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class Map_Ex {
    public static void main(String[] args) {
        //Declare MAp
        Map<String, Integer> inventory = new HashMap<>();
        // Add key pairs and values --> important
        // Ex key = name String
        // Ex value = "Student" String
        //Everytime I see a **PUT** it means "Modify"
        inventory.put("Pencil", 10); // Cancelled by line 17
        inventory.put("Notebook", 5);
        inventory.put("Pencil", 20); // Overwrote the previous pencil in line 15

        // Access the value
        System.out.println("The pencil quantity is: " + inventory.get("Pencil"));

        // Explore a map
        System.out.println("Complete inventory!!");
        System.out.println(" ");

        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }

        // Verify if it exists
        // This return a boolean, if found it return true
        System.out.println("Pencil exists? " + inventory.containsKey("Pencil"));
    }
}
