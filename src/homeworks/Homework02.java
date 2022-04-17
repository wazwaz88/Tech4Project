package homeworks;


import java.util.Scanner;


public class Homework02 {
    public static void main(String[] args){


        System.out.println("Task 1");
    Scanner scn1 = new Scanner(System.in);

        System.out.println("Input your first name.");
        String firstName = scn1.next();
        System.out.println("Input your last name. ");
        String lastName = scn1.next();

        System.out.println("Input your age.");
        int age = scn1.nextInt();

        System.out.println("Input your email.");
        String email = scn1.next();

        System.out.println("Input your phone number.");
        scn1.nextLine();
        String phoneNumber = scn1.nextLine();

        System.out.println("Input your address");
        String address = scn1.nextLine();

        System.out.println("\tUser who joined this program is " + firstName + " " + lastName + ". " + firstName + "\'s age is "
                + age + ". " + firstName + "\'s email \naddress is " + email + ", phone number " + phoneNumber + ", and " +
                "address is \n" + address + ".");

        System.out.println();
        System.out.println("Task 2");

        Scanner scn2 = new Scanner(System.in);
        System.out.println("Input your favorite book.");
        String favBook = scn2.nextLine();

        System.out.println("Input your favorite color.");
        String favColor = scn2.next();

        System.out.println("Input your favorite number.");
        int favNumber = scn2.nextInt();


        System.out.println("User's favorite book is: " + favBook + "." +
                "\nUser's favorite color is: " + favColor + "." +
                "\nUser's favorite number is: " + favNumber + ".");







    }





}
