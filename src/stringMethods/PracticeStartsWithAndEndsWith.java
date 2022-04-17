package stringMethods;

import utilities.ScannerHelper;

import java.util.Scanner;

public class PracticeStartsWithAndEndsWith {
    public static void main(String[] args) {


        Scanner userInput = new Scanner(System.in);

        String name = ScannerHelper.getNameFromUser();

        if(name.startsWith("A") || name.startsWith("a")) System.out.println("You are in the club A");
        else System.out.println("You are not in the club A");

        if(name.charAt(0) == 97 || name.charAt(0) == 65) System.out.println("You are in the club A");
        else System.out.println("You are not in the club A");




    }
}
