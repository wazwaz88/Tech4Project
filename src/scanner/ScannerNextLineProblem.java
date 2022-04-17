package scanner;

import java.util.Scanner;
public class ScannerNextLineProblem {

    public static void main(String[] args){

        /*
        first name = next
        age = nextInt
        myBrainOK = nextBoolean
        address = nextLine
         */



     Scanner scn1 = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = scn1.next();
        System.out.println("User's name is = ".concat(userName));

        System.out.println("What is your age?");
        int userAge = scn1.nextInt();
        System.out.println("User's age is = " + userAge);


        System.out.println("Is your brain fried? (true/false)");
        boolean userBrainOK = scn1.nextBoolean();
        System.out.println("Users brain is fried = " + userBrainOK);


        System.out.println("What is user's address?");

        /**a. add nextLine
        //scn1.nextLine();
        b. add a new scanner object
         */

        Scanner scn2 = new Scanner(System.in);
                String userAddress = scn2.nextLine();


        System.out.println("User's address is = " + userAddress);



    }
}
