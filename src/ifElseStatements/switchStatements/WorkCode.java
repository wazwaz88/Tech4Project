package ifElseStatements.switchStatements;

import java.util.Scanner;
public class WorkCode {
    public static void main(String[] args) {

        /*

        Write a program ask user to enter which day is it
        Based on the answer print what color will be selected

         1 Monday = blue
         2 tuesday = red
         3 wed = purple
         4 thurssay = yellow
         5 friday = orange
         */

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 5.");
        int number = userInput.nextInt();


        //first way
/*
        if(number == 1) System.out.println("It is Monday. Wear Blue!");
        else if(number == 2) System.out.println("It is Tuesday. Wear Red!");
        else if(number == 3) System.out.println("It is wednesday. Wear Purple!");
        else if(number == 4) System.out.println("It is thursday. Wear yellow!");
        else if(number == 5) System.out.println("It is friday. Wear orange");
        else if(number == 6 || number == 7) System.out.println("It is weekend");
        else System.out.println("This is not representing any day!");

*/
        //second way - switch cases



        switch (number){
            case 1:
                System.out.println("It is Monday. Wear Blue!");
                break;
            case 2:
                System.out.println("It is Tuesday. Wear Red!");
                break;
            case 3:
                System.out.println("It is wednesday. Wear Purple!");
                break;
            case 4:
                System.out.println("It is thursday. Wear yellow!");
                break;
            case 5:
                System.out.println("It is friday. Wear orange");
                break;
            case 6:
            case 7:
                System.out.println("It is Weekend");
                break;
            default:
                System.out.println("This is not representing any day!");
        }






    }
}
