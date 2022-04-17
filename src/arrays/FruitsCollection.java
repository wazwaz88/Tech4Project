package arrays;

import java.util.Arrays;
import java.util.Locale;

public class FruitsCollection {
    public static void main(String[] args) {


        /*
        Task-1
        Create an array that will store 4 fruit names
        Then, print the empty array

        EXPECTED OUTPUT:
        [null, null, null, null]
         */

        String[] fruits = new String[4]; // another way: String fruits[]

        System.out.println(Arrays.toString(fruits));


                /*
        Task-2
        Store your fav fruit in the index of 0
        Store the 4th fav fruit in the index of 3
        Print the array again

        EXPECTED OUTPUT:
        [Apple, null, null, Banana]
         */


        // apple, banana, watermelon, pear
        fruits[0] = "watermelon";
        fruits[3] = "pear";

        System.out.println(Arrays.toString(fruits));


        //Task 3

        System.out.println(fruits.length); //this length has no parentheses. this is instance variable, not method.

        // size of an array is to know how many elements array contains.

        //Task 4= print element at 0 and 3

        System.out.println(fruits[0]); //watermelon
        System.out.println(fruits[3]); //pear

        //what if we try to get a value that is null

        System.out.println(fruits[1]);


        System.out.println(fruits[0].toUpperCase()); //WATERMELON
        System.out.println(fruits[0].charAt(0)); // w
        System.out.println(fruits[3].length()); // 4
        System.out.println(fruits[3].startsWith("p")); // true

        System.out.println(fruits[1].length()); // NullPointerException


    }
}
