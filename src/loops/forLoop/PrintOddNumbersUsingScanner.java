package loops.forLoop;

import java.util.Scanner;

public class PrintOddNumbersUsingScanner {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter a number");
        int num = userInput.nextInt();


        for(int i = 0; i <= num; i++){
            if (i % 2 == 1){
                System.out.println(i);
            }

        }
    }
}
