package utilities;

import java.util.Scanner;

public class ScannerHelper {

    public static int getNumberFromUser(){
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter a number");
        int number = userInput.nextInt();
        userInput.nextLine();
        return number;

    }


    public static String getNameFromUser(){
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter your name");
        String name = userInput.nextLine();

        return name;

    }


    public static String getStringFromUser(){
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter a string");
        String string = userInput.nextLine();
        return string;

    }

    public static String getAddressFromUser(){
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter an address");
        String address = userInput.nextLine();
        return address;

    }

    public static String get4ColorsFromUser(){
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter at least 4 colors");
        String colors = userInput.nextLine();
        return colors;

    }


}
