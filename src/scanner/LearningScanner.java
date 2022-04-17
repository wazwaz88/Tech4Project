package scanner;

import java.util.Scanner;


public class LearningScanner {
    public static void main(String[] args){



        /*
        1. I am going to use Scanner Class for creating my object
        2. I will use the object for reading the data.
         */

        Scanner scn1 = new Scanner(System.in); //creating a scanner object for using the methods.
                                                // in this the next method



        System.out.println("Please put your first name."); //this is what I want user to put

        String firstName = scn1.next(); //Abdullah // storing the first name from user. stops all code after.

        System.out.println("Please put your last name.");

        String lastName = scn1.next();


        System.out.println("Your full name = " + firstName + " " + lastName); // printing my object


        System.out.println("What is your address?");

        //a.
        //Scanner scn2 = new Scanner(System.in);  //new used to create an object

        //b.

        scn1.nextLine();
        String userAddress = scn1.nextLine();

        //
        System.out.println("User address is = " + "\"" + userAddress + "\"");

        //using next and nextline after causes problems. the computer takes all the empty space after and the next line
        //uses that.
        //solution: a. add a new scanner. b. put two nextlines

    }
}
