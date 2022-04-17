package scanner;

import java.util.Scanner;

public class ScannerExercises {
    public static void main(String[] args){

        Scanner fullName = new Scanner(System.in);

        System.out.println("What is your full name?");
        String name = fullName.nextLine();
        System.out.println("My full name is = " + name);


        /*
        Write a Java program that asks user to enter
        3 numbers and print the sum of those 3 numbers
         */

        Scanner userInput = new Scanner(System.in);

        System.out.println("First Number:");
        int num1 = userInput.nextInt();
        System.out.println("Second Number:");
        int num2 = userInput.nextInt();
        System.out.println("Third Number:");
        int num3 = userInput.nextInt();


        // int sum - num1 + num2 + num3; extra step. can sub below to be sum instead of adding more
        // parentheses.
        System.out.println("Sum of the numbers is = " + (num1 + num2 + num3));





    }


}
