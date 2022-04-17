package homeworks;

import java.util.Scanner;
public class Homework04 {
    public static void main(String[] args) {

        System.out.println("Task1\n");
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter 2 numbers.");
        int num1 = userInput.nextInt(), num2 = userInput.nextInt();
        int avgNum1And2 = (num1 + num2) / 2;


        System.out.println("The average of the given 2 numbers is: " + avgNum1And2);

        System.out.println("\nTask2\n");

        System.out.println("Please enter 2 numbers.");
        int num3 = userInput.nextInt(), num4 = userInput.nextInt();
        int productOfNum3AndNum4 = num3 * num4;

        System.out.println("The product of the vien 2 numbers is: " + productOfNum3AndNum4);

        System.out.println("\nTask3\n");

        System.out.println("Please enter 3 numbers.");
        int num5 = userInput.nextInt(), num6 = userInput.nextInt(), num7 = userInput.nextInt();
        int squareNum5 = num5 * num5;
        int squareNum6 = num6 * num6;
        int squareNum7 = num7 * num7;

        System.out.println("The " + num5 + " multiplied with " + num5 + " is = " + squareNum5);
        System.out.println("The " + num6 + " multiplied with " + num6 + " is = " + squareNum6);
        System.out.println("The " + num7 + " multiplied with " + num7 + " is = " + squareNum7);


        System.out.println("\nTask4\n");
        System.out.println("Please enter 2 numbers.");
        int num8 = userInput.nextInt(), num9 = userInput.nextInt();
        int remainderNum8OfNum9 = num8 % num9;

        System.out.println("The remainder of " + num8 + " % " + num9 + " = " + remainderNum8OfNum9);



        System.out.println("\nTask5\n");
        System.out.println("Please enter 5 numbers.");
        int num10 = userInput.nextInt(), num11 = userInput.nextInt(), num12 = userInput.nextInt();
        int num13 = userInput.nextInt(), num14 = userInput.nextInt();

        int avgOfNum10_Num15 = (num10 + num11 + num12 + num13 + num14) / 5;


        System.out.println("The average of the 5 given numbers is: " + avgOfNum10_Num15);


        System.out.println("\nTask6\n");
        System.out.println("Please enter a number.");
        int num15 = userInput.nextInt();

        int num151 = num15 * 1;
        int num152 = num15 * 2;
        int num153 = num15 * 3;
        int num154 = num15 * 4;
        int num155 = num15 * 5;
        int num156 = num15 * 6;
        int num157 = num15 * 7;
        int num158 = num15 * 8;
        int num159 = num15 * 9;
        int num1510 = num15 * 10;

        System.out.println(num15 + " * 1 = " + num151);
        System.out.println(num15 + " * 2 = " + num152);
        System.out.println(num15 + " * 3 = " + num153);
        System.out.println(num15 + " * 4 = " + num154);
        System.out.println(num15 + " * 5 = " + num155);
        System.out.println(num15 + " * 6 = " + num156);
        System.out.println(num15 + " * 7 = " + num157);
        System.out.println(num15 + " * 8 = " + num158);
        System.out.println(num15 + " * 9 = " + num159);
        System.out.println(num15 + " * 10 = " + num1510);


        System.out.println("\nTask7\n");
        System.out.println("Please enter the length of a side of a square.");
        int sideOfSquare = userInput.nextInt();
        int area = sideOfSquare * sideOfSquare;
        int perimeter = 4 * sideOfSquare;

        System.out.println("Perimeter of the square = " + perimeter);
        System.out.println("Area of the square = " + area);







    }
}
