package homeworks;

import java.util.Scanner;
public class Homework03 {
    public static void main(String[] args){

        System.out.println("Task 1 \n");

        Scanner userInt = new Scanner(System.in);

        System.out.println("Pick your 1st number.");
        int number1 = userInt.nextInt();

        System.out.println("Pick your 2nd number.");
        int number2 = userInt.nextInt();

        System.out.println("The number 1 entered by user is = " + number1);
        System.out.println("The number 2 entered by user is = " + number2);
        System.out.println("The sum of number 1 and 2 entered by user is = " + (number1 + number2));

        System.out.println("\nTask 2\n");

        Scanner userDouble = new Scanner(System.in);

        System.out.println("Pick your first number.");
        double Double1 = userDouble.nextDouble();

        System.out.println("Pick your second number.");
        double Double2= userDouble.nextDouble();

        System.out.println("The number 1 entered by user is = " + Double1);
        System.out.println("The number 2 entered by user is = " + Double2);
        System.out.println("The division of number 1 and 2 entered by user is = " + (Double1 / Double2));

        System.out.println("\nTask 3\n");

        System.out.println( -10 + (7 * 5));
        System.out.println( (72 + 24) % 24);
        System.out.println( 10 + (-3 * 9 / 9));
        System.out.println( 5 + (18 / 3 * 3) - (6 % 3));

        System.out.println("\nTask 4\n");

        Scanner userDouble2 = new Scanner(System.in);

        System.out.println("Enter your 1st number.");
        double Double3 = userDouble2.nextDouble();
        System.out.println("Enter your 2nd number.");
        double Double4 = userDouble2.nextDouble();

        System.out.println("The sum of the given numbers is = " + (Double3 + Double4));
        System.out.println("The product of the given numbers is = " + (Double3 * Double4));
        System.out.println("The subtraction of the given numbers is = " + (Double3 - Double4));
        System.out.println("The division of the given numbers is = " + (Double3 / Double4));
        System.out.println("The remainder of the given numbers is = " + (Double3 % Double4));


        System.out.println("\nTask 5\n");

        double widthRect = 7.5;
        double heightRect = 10.5;

        double area = widthRect * heightRect;
        double perimeter = 2 * (widthRect + heightRect);

        System.out.println("The area of a rectangle = " + area);
        System.out.println("The perimeter of the rectangle = " + perimeter);

        System.out.println("\nTask 6\n");

        double annualSalary = 90000;
        double threeYearSalary = 3 * annualSalary;

        System.out.println("A Software Engineer in Test can earn " + threeYearSalary + " in 3 years");



    }
}
