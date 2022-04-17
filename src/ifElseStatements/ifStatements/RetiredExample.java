package ifElseStatements.ifStatements;

import java.util.Scanner;
public class RetiredExample {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter your age.");

        int userAge = userInput.nextInt();

        if(userAge >= 55){
            System.out.println("It is your time to get retried!");
        } else{
            System.out.println("You are not going to retire.");
        }

    }
}
