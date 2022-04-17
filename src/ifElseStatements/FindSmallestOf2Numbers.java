package ifElseStatements;

import java.util.Scanner;
public class FindSmallestOf2Numbers {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please input to 2 numbers");
        int num1 = userInput.nextInt(), num2 = userInput.nextInt();

        if(num1 < num2){
            System.out.println(num1);
        }else{
            System.out.println(num2);
        }



        //int smallestnumber = num1 < num2 ? num1 : num2;

        System.out.println(num1 < num2 ? num1 : num2);


    }
}
