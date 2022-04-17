package projects;

import java.util.Scanner;
public class Project02 {
    public static void main(String[] args) {


        System.out.println("Task1\n");

        Scanner scn1 = new Scanner(System.in);

        System.out.println("Please enter 3 numbers.");
        int num1 = scn1.nextInt(), num2 = scn1.nextInt(), num3 = scn1.nextInt();

        System.out.println("The product of the numbers entered is = " + (num1 * num2 * num3));

        System.out.println("\nTask2\n");

        System.out.println("What is your first name?");
        String firstName = scn1.next();
        System.out.println("What is your last name?");
        String lastName = scn1.next();;
        System.out.println("What is your year of brith?");
        int yearOfBirth = scn1.nextInt();

        System.out.println(firstName + " " + lastName + "'s age is = " + (2022 - yearOfBirth));


        System.out.println("\nTask3\n");

        Scanner scn2 = new Scanner(System.in);

        System.out.println("What is your full name?");
        String fullName = scn2.nextLine();
        System.out.println("What is your weight?");
        int weight = scn2.nextInt();

        System.out.println(fullName + "'s weight is = " + (weight * 2.205) + "lbs.");

        System.out.println("\nTask4\n");

        Scanner scn3 = new Scanner(System.in);

        System.out.println("What is your full name?");
        String student1 = scn3.nextLine();

        System.out.println("What is your age?");
        int age1 = scn3.nextInt();

        scn3.nextLine();

        System.out.println("What is your full name?");
        String student2 = scn3.nextLine();

        System.out.println("What is your age?");
        int age2 = scn3.nextInt();

        scn3.nextLine();

        System.out.println("What is your full name?");
        String student3 = scn3.nextLine();

        System.out.println("What is your age?");
        int age3 = scn3.nextInt();


        int averageAge = (age1 + age2 + age3) / 3;

        System.out.println(student1 + "'s age is " + age1 + ".");
        System.out.println(student2 + "'s age is " + age2 + ".");
        System.out.println(student3 + "'s age is " + age3 + ".");

        System.out.println("The average is " + averageAge + ".");

        System.out.println("The eldest age is " + Math.max(age1, Math.max(age2, age3)) + ".");

        System.out.println("The youngest age is " + Math.min(age1, Math.min(age2, age3)) + ".");





    }
}
