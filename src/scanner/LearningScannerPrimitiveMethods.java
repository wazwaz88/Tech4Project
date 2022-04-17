package scanner;


import java.util.Scanner;

public class LearningScannerPrimitiveMethods {
    public static void main(String[] args) {


        /*
        How to use scanner methods
        1.Create an object of scanner (import the class as well)
        ClassName/DataType variableName/objectName = new ClassName/DataType(if it is needed)
         */

        /*
         Task-1
         1. Ask user to enter their age
         2. Print the question
         3. Use the proper next method (nextInt)
         4. print out the user's results
         */

        Scanner collect = new Scanner(System.in);

        System.out.println("What is your age?");

        int userAge = collect.nextInt();

        System.out.println("The user's age is = " + userAge);


        System.out.println("What is your account balance?");

        double userAccountBalance = collect.nextDouble();

        System.out.println("\n\t\'User account balance is\' = \"$" + userAccountBalance + "\"");

        System.out.println("Are you understanding this java class? (ture/false)");
        boolean yourAnswer = collect.nextBoolean();
        System.out.println("User should not watch the video of today = " + yourAnswer);




    }



}
