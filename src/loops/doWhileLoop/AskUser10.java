package loops.doWhileLoop;

import java.util.Scanner;

public class AskUser10 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        /*

        System.out.println("Please enter a number");

        int number = userInput.nextInt();

        while(number < 10){
            System.out.println("This number is not more than or equal to 10");
            System.out.println("Please enter a new number");
            number = userInput.nextInt();
        }

        System.out.println("This number is more than or equal to 15");

        */

        int number;

        do{
            System.out.println("Please enter a number");
            number = userInput.nextInt();


        }while(number < 10);

        System.out.println("This number is more than or equal to 15");



    }
}
