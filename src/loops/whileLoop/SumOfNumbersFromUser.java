package loops.whileLoop;

import java.util.Scanner;

public class SumOfNumbersFromUser {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter how many number you want to enter");
        int numberOfNumbers = userInput.nextInt();


        int sum = 0;
        int count = 1;

        while (count <= numberOfNumbers){
            System.out.println("Please enter number " + count);
            sum += userInput.nextInt();
            count++;
        }

        System.out.println(sum);

        System.out.println("\n-----fori solution-----\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter how many number you want to enter?");
        int totalNumbers = input.nextInt(); // 3

        int sum2 = 0;

        for(int i = 1; i <= totalNumbers; i++){
            System.out.println("Please enter number " + i);
            sum2 += input.nextInt();
        }

        System.out.println(sum2);


    }

}
