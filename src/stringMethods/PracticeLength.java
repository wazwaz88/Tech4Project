package stringMethods;

import java.util.Scanner;

public class PracticeLength {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter your favorite book name");
        String bookName = userInput.nextLine();

        System.out.println("Please enter your favorite quote");
        String quote = userInput.nextLine();

        System.out.println("The length of the name of the book is = " + bookName.length());
        System.out.println("The length of the quote give is = " + quote.length());



    }
}
