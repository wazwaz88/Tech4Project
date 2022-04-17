package ifElseStatements.ifElseStatements;

import java.util.Scanner;
public class DividableBy7 {
    public static void main(String[] args) {

        Scanner userInput= new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = userInput.nextInt();

        if(number % 7 == 0){
            System.out.println("The number you entered is divisible by 7!");
        }else{
            System.out.println("The number you entered is not divisible by 7!");
        }

    }

}
