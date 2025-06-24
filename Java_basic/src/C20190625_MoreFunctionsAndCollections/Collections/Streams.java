package C20190625_MoreFunctionsAndCollections.Collections;

import java.util.stream.Collectors;
import java.util.List;

public class Streams {
    public static void main(String[] args) {

        // Declare an Stream
        List<String> names = List.of("Luffy", "Franky", "Robin", "Harry", "Nat");

        // Use Stream to filter, Transform and collect

        List<String> result = names.stream()
                .filter(n -> n.startsWith("A")) //Filter names that starts with "A"
                .map(String::toUpperCase) // Convert to uppercase
                .sorted() // Order by abc...
                .collect(Collectors.toUnmodifiableList()); // Cut into new list

        System.out.println("Filter Names: ");
        result.forEach(System.out::println);

    }


}
