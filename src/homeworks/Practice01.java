package homeworks;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {

        /*
        Assume that you are given a String as below;
String str = ”SDLC is step by step procedure to create an application”;
Write a program to find length of given String and the indexes of “SDLC” and “application” words
         */

        System.out.println("Task 1");


        String str = "SDLC is step by step procedure to create an application";


        System.out.println("The length of '" + str + "' is = " + str.length());
        System.out.println("The index of 'SDLC' is = " + str.indexOf("SDLC"));
        System.out.println("The index of 'application' is = " + str.lastIndexOf("application"));

        System.out.println("Task 2");

        /*
        Assume that you are given a String as below;
String str = “  I know how to code with Python  ”;
•
Write a program to manipulate given String and convert it to be:
“I KNOW HOW TO CODE WITH JAVA”
         */

        String str2 = "  I know how to code with Python  ";

        System.out.println(str2.trim().replaceFirst("Python", "Java").toUpperCase());


        System.out.println("Task 3");


        /*
        Assume that you are given a String as below;
String str = “    SDLC has planning, design, development, testing, deployment and maintenance phases   ”;
1.Find the first character of given String which is not white space
2.Find the last character of given String which is not white space
         */

        String str3 = "    SDLC has planning, design, development, testing, deployment and maintenance phases   ";


        System.out.println(str3.trim().charAt(0));
        System.out.println(str3.trim().charAt(str3.trim().length() - 1));


        System.out.println("Task 4");

        /*
        Assume you are given 3 Strings as below;
String s1 = “  TECH ”;
String s2 = “ glo  ”;
String s3 = “ BAL       “;
Write a program that manipulates these 3 Strings and stores them in a new String s4 and s4 will get value of “TechGlobal”
Note: The length of s4 will be 10 at the end!!!
         */


        String s1 = "  TECH ".trim().replace("ECH", "ech");
        String s2 = " glo  ".trim().replace('g', 'G');
        String s3 = " BAL       ".trim().replace("BAL", "bal");

        System.out.println(s1 + s2 + s3);


        System.out.println("Task 5");

        /*
        Write a program that asks user to enter their favorite color.
Then, print the first and last characters of the color
Also, print the first and last 3 characters of the color
Test data:
green
Expected output:
1st character is = g
2nd character is = n
First 3 characters are = gre
Last 3 characters are = een
         */


        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter your favorite color");
        String color = userInput.next();

        System.out.println("1st character is = " + color.charAt(0));
        System.out.println("2nd character is = " + color.charAt(1));
        System.out.println("2nd character is = " + color.substring(0, 3));
        System.out.println("2nd character is = " + color.substring(color.length() - 3));


        System.out.println("Task 6");


        /*
        Write a program that asks user to enter a full sentence
Then, convert all sentence to lower case and print the first and last words in the given sentence
Test data:
JavA is an object-oriented programming LanguAGE
Expected output:
1st word is = java
2nd word is = language
         */

        String sentence = ScannerHelper.getStringFromUser().toLowerCase();
        userInput.nextLine();

        System.out.println("1st word is = " + sentence.substring(0, sentence.indexOf(" ")));
        System.out.println("last word is = " + sentence.substring(sentence.lastIndexOf(" ") + 1));



        System.out.println("Task 7");
        String sentence2 = ScannerHelper.getStringFromUser().toLowerCase();



        if(sentence2.contains("$")){
            System.out.println("This sentence contains $ character");

            System.out.println("$ character's index is = " + sentence2.indexOf('$'));

        }else{
            System.out.println("This sentence does not contain $ character");
        }







    }
}
