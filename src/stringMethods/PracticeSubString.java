package stringMethods;

import java.util.Scanner;

public class PracticeSubString {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = userInput.nextLine();



        System.out.println("the first word is = '" + sentence.substring(0, sentence.indexOf(' ')) + "'");
        System.out.println("the last word is = '" + (sentence.substring(sentence.lastIndexOf(' ') + 1)) + "'");



    }
}
