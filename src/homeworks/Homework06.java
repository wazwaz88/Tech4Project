package homeworks;

import java.util.Scanner;
public class Homework06 {
    public static void main(String[] args) {


        System.out.println("Task1\n");

        String s1 = "5", s2 = "10";

        int sI1 = Integer.parseInt(s1);
        int sI2 = Integer.parseInt(s2);

        System.out.println("Sum of " + sI1 + " and " + sI2 + " is = " + (sI1 + sI2));
        System.out.println("Product of " + sI1 + " and " + sI2 + " is = " + (sI1 * sI2));
        System.out.println("Division of " + sI1 + " and " + sI2 + " is = " + (sI1 / sI2));
        System.out.println("Subtraction of " + sI1 + " and " + sI2 + " is = " + (sI1 - sI2));
        System.out.println("Remainder of " + sI1 + " and " + sI2 + " is = " + (sI1 % sI2));



        System.out.println("\nTask2\n");


        String s3 = "200", s4 = "-50";
        int sI3 = Integer.parseInt(s3), sI4 = Integer.parseInt(s4);

        System.out.println("The greatest value is = " + Math.max(sI3, sI4));
        System.out.println("The smallest value is = " + Math.min(sI3, sI4));
        System.out.println("The average is = " + (sI3 + sI4) / 2);
        System.out.println("The absolute difference is = " + Math.abs(sI3 - sI4));


        System.out.println("\nTask3\n");

        double changePerDay = 0.96;

        double twentyFour$ = 24 / changePerDay;
        double oneHundredSixtyEight$ = 168 / changePerDay;
        double after5Months = changePerDay * 150;

        System.out.println((int)twentyFour$ + " days");
        System.out.println((int)oneHundredSixtyEight$ + " days");
        System.out.println("$" + after5Months);

        System.out.println("\nTask4\n");

        double savePerDay = 62.5;
        double newComputer = 1250;
        double amountOfDays = newComputer / savePerDay;

        System.out.println((int) amountOfDays);


        System.out.println("\nTask5\n");

        double newCar = 14265;
        double option1 = 475.5;
        double option2 = 951;

        int optionDays1 = (int) (newCar / option1);
        int optionDays2 = (int) (newCar / option2);

        System.out.println("Option 1 will take " + optionDays1 + " months");
        System.out.println("Option 2 will take " + optionDays2 + " months");


        System.out.println("\nTask6\n");


        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter 2 numbers.");

        int var1 = userInput.nextInt(), var2 = userInput.nextInt();

        double varDouble1 = var1;
        double varDouble2 = var2;


        double varDividedByVar2 = varDouble1 / varDouble2;

        System.out.println(varDividedByVar2);







    }
}
