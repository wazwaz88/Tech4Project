package loops.controlStatements;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {


        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter 2 different integers between 0 and 10");
        int num1 = userInput.nextInt(), num2 = userInput.nextInt();


        for (int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++) {
            if(i == 5) continue;
            System.out.println(i);
        }







    }
}
