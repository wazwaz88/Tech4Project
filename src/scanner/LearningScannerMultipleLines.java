package scanner;

import java.util.Scanner;

public class LearningScannerMultipleLines {
    public static void main(String[] args){

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Where is your address?");
        String userAddress = sc1.nextLine();

        System.out.println("User Address is = ".concat("\"" + userAddress + "\""));







    }


}
