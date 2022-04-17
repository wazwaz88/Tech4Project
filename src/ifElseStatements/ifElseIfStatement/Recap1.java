package ifElseStatements.ifElseIfStatement;

import java.util.Scanner;

public class Recap1 {
    public static void main(String[] args) {
        System.out.println("Start of the program");
        Scanner userInput = new Scanner(System.in);
        System.out.println("What time is it?");
        int hour = userInput.nextInt();



        if(hour > 6 && hour < 12){ //true
            System.out.println("Good morning");
        }else

        if(hour > 17 && hour < 20){ //false
            System.out.println("Good evening");
        }else


        if(hour > 20 && hour < 24){ //false
            System.out.println("Good night");
        }else{
            System.out.println("Goodbye");
        }

        System.out.println("End of the program");


    }
}
