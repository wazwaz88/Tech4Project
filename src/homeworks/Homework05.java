package homeworks;

import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {


        Scanner userInput = new Scanner(System.in);

        System.out.println("Task 1\n");

        System.out.println("Please enter 3 numbers.");
        int num1 = userInput.nextInt(), num2 = userInput.nextInt(), num3 = userInput.nextInt();

        System.out.println("Max value = " + Math.max(num1, Math.max(num2, num3)));
        System.out.println("Min value = " + Math.min(num1, Math.min(num2, num3)));


        System.out.println("\nTask 2\n");
        System.out.println("Please enter 5 numbers.");
        int num4 = userInput.nextInt(), num5 = userInput.nextInt(), num6 = userInput.nextInt();
        int num7 = userInput.nextInt(), num8 = userInput.nextInt();

        System.out.println("Max value = " + Math.max(num4, Math.max(num5, Math.max(num6, Math.max(num7, num8)))));

        System.out.println("Min value = " + Math.min(num4, Math.min(num5, Math.min(num6, Math.min(num7, num8)))));

        System.out.println("\nTask 3\n");

        System.out.println("Please enter 2 numbers.");
        int num9 = userInput.nextInt(), num10 = userInput.nextInt();

        System.out.println("The difference between the number is = " + Math.abs(num9 - num10));


        System.out.println("\nTask 4\n");

        int random0 = (int) (Math.random() * (100 - 50 + 1) + 50);
        int random1 = (int) (Math.random() * 51 + 50);
        int random2 = (int) (Math.random() * 51 + 50);
        int sumRandom = random0 + random1 + random2;

        System.out.println("Number 1 = " + random0);
        System.out.println("Number 2 = " + random1);
        System.out.println("Number 3 = " + random2);
        System.out.println("The sum of number is = " + sumRandom);



        System.out.println("\nTask 5\n");

        double alex$ = 125;
        double mike$ = 220;
        double give$ = 25.5;

        System.out.println("Alex's money: $" + Math.abs(alex$ - give$));
        System.out.println("Mike's money: $" + Math.abs(mike$ + give$));


        System.out.println("\nTask 6\n");


        double totalAmount = 390;
        double savePerDay = 15.60;
        double howManyDays = totalAmount/savePerDay;

        System.out.println(howManyDays);






    }
}
