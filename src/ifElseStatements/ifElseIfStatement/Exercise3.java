package ifElseStatements.ifElseIfStatement;

import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {


        /*
                Ask user to enter their age and weight and if they are older than
                18 print out "You are old enough to drive" else "You are not old enough
                for driving", if they are heavier than 150 pounds print out "You are heavier
                than 150 pounds" else "You are lighter than 150 pounds"

                input:
        age = 15, weight = 159
        output:
        "You are not old enough for driving"
        "You are heavier than 150 pounds"

        input:
        age = 67, weight = 110
        output:
        "You are old enough to drive"
        "You are lighter than 150 pounds"
         */



        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter age and weight");
        int age = userInput.nextInt(), weight = userInput.nextInt();

        if(age >= 18){
            System.out.println("You are old enough to drive");
        }else{
            System.out.println("You are not old enough to drive");
        }

        if(weight >= 150){
            System.out.println("You are heavier than 150 lbs.");
        }else{
            System.out.println("You are lighter than 150 lbs.");
        }


    }
}
