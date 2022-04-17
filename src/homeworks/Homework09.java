package homeworks;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Homework09 {
    public static void main(String[] args) {

        System.out.println("Task 1\n");


        String name = ScannerHelper.getNameFromUser();

        System.out.println("The length of the name is = " + name.length());
        System.out.println("The first character in the name is = " + name.charAt(0));
        System.out.println("The last character in the name is = " + name.charAt(name.length() - 1));
        System.out.println("The first 3 characters in the name is = " + name.substring(0, 3));
        System.out.println("The last 3 characters in the name is = " + name.substring(name.length() - 3));
        System.out.println(name.toUpperCase().charAt(0) == 'A' ? "You are in the club!" : "Sorry, you are not in the club");



        System.out.println("\nTask 2\n");

        String address = ScannerHelper.getAddressFromUser();

        if(address.toUpperCase().contains("CHICAGO")){
            System.out.println("You are in the club");
        }else if (address.toUpperCase().contains("DES PLAINES")){
            System.out.println("You are welcome to join the club");
        }else{
            System.out.println("Sorry, you will never be in the club");
        }


        System.out.println("\nTask 3\n");


        String colors = ScannerHelper.get4ColorsFromUser();

        if (colors.toUpperCase().contains("RED") && colors.toUpperCase().contains("GREEN")) {
            System.out.println("Green and red are in the list");
        }else if(colors.toUpperCase().contains("RED")){
            System.out.println("Red is in the list");
        }else if(colors.toUpperCase().contains("GREEN")){
            System.out.println("Green is in the list");
        }else{
            System.out.println("Green and red are not in the list");
        }




        System.out.println("\nTask 4\n");


        String str = "   Java is FUN   ";

        String word1 = str.trim().substring(0, 4), word2 = str.trim().substring(5, 7), word3 = str.trim().substring(8, 11);

        System.out.println("The first word in the str is = " + word1.toLowerCase());
        System.out.println("The second word in the str is = " + word2.toLowerCase());
        System.out.println("The third word in the str is = " + word3.toLowerCase());





    }
}
