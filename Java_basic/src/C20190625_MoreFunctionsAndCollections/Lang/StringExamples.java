package C20190625_MoreFunctionsAndCollections.Lang;

public class StringExamples {
    public static void main(String[] args) {
        //Hacer referencias a los textos de java.lang

        String text = "Hello World";
        System.out.println("Length: " + text.length());
        System.out.println("First character: " + text.charAt(0));
        System.out.println("Last character: " + text.charAt(text.length() -1)); //With -1 you can reach the last character
        System.out.println("To uppercase: " + text.toUpperCase());
        System.out.println("To lowercase: " + text.toLowerCase());
        System.out.println("Without spaces: " + text.trim());
        System.out.println("Without spaces and in lowercase: " + text.trim().toLowerCase());
        System.out.println("Without spaces and in uppercase: " + text.trim().toUpperCase());
        System.out.println("Concat: " + text.concat("!!!"));
        System.out.println("Substring: " + text.substring(0,5));
        System.out.println("Contains World?: " + text.contains("World"));
        System.out.println("Contains WORLD?: " + text.indexOf("WORLD")); //Returns the position of the first occurrence of specified character(s) in a string



    }
}
