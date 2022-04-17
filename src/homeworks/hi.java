package homeworks;

import utilities.ScannerHelper;

import java.util.Scanner;

public class hi {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);



        System.out.println("\nTask 6");

        System.out.println("Please enter a positive number");
        int num1 = userInput.nextInt();

        int product = 1;

        if(num1 >= 0){

            for(int i = 1; num1 >= i; num1++){

                product = product * i;
            }
        }
        System.out.println(product);



        int fact=1;
        int number=5;//It is the number to calculate factorial
        for(int i = 1;i <= number; i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);








    }
}
