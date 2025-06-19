package C20190625_MoreFunctionsAndCollections.Collections;

public class Array {

    public static void main(String[] args) {

        // Fixed Array
        // With Arrays I have to use []
        // syntax: type[] name;

        int[] number = new int[5];

        number[0] = 10;
        number[1] = 20;
        number[2] = 30;
        number[3] = 40;
        number[4] = 50;

        System.out.println("" + number.length);
        System.out.println(" ");

        int i;
        for (i = 0; i < number.length; i++){
            System.out.println("Index " + i + ": " + number[i]);
        }

        String[] fruits = {"Apple", "Pear", "Grape"};

        System.out.print("\nFruits: ");
        for (String fruit : fruits){
            System.out.print(fruit + " ");
            //fruit is a temporary variable that is used to access each element of the fruits array on each turn of the loop.

        }


    }
}
