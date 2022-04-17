package stringMethods;


import utilities.ScannerHelper;

import java.util.Scanner;

public class PracticeFirstAndLastChar {
    public static void main(String[] args) {

        String name = ScannerHelper.getNameFromUser();

        System.out.println(name.charAt(0)); // first char
        System.out.println(name.charAt(name.length() - 1)); //last char








    }
}
