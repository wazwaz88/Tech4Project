package ifElseStatements.ifStatements;

import java.util.Scanner;
public class EvenOrOddExample {
    public static void main(String[] args) {


        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter a number.");
        int number = userInput.nextInt();

        if( number % 2 == 0){
            System.out.println("The number is even.");
        } else{
            System.out.println("The number is odd.");
        }




    }
}
