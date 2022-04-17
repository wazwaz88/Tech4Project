package stringMethods;

public class _07_indexOf {
    public static void main(String[] args) {

         /*
        Method Task:They are used to find the index or last index of some char or String values in another String
        -They are non-static methods and called with another String object
        -They are return type, and they return int as index
        -They take either String or char as arguments

        NOTE: if the given char or String does not exist, then they return -1
        NOTE: if you are looking for an index of String, and it exists, it will return the first index of found match
        EXAMPLE: sentence.indexOf("Chicago"); // 7
         */

        //exact opposite of charAt

        String name = "Anas";
        String word = "Banana";

        System.out.println(name.indexOf('k'));// -1
        System.out.println(name.indexOf('s'));// 3
        System.out.println(word.indexOf('a'));// 1
        System.out.println(word.indexOf('n'));// 2
        System.out.println(word.lastIndexOf('a')); // 5
        System.out.println(word.lastIndexOf('n')); // 4

        System.out.println(word.indexOf("an")); // 1
        System.out.println(word.lastIndexOf("an")); // 3
        System.out.println(word.indexOf(word)); // 0
        System.out.println(word.lastIndexOf(word)); // 0

        // only first and last index. we dont have in betweeners

        String sentence = "I like Chicago and Miami more than any other cities";

        System.out.println(sentence.indexOf("Chicago")); // 7
        System.out.println(sentence.indexOf("an")); // 15
        System.out.println(sentence.lastIndexOf("an")); // 35


        sentence.indexOf('C', 50); // -1
        // eliminates 50 characters

    }
}
