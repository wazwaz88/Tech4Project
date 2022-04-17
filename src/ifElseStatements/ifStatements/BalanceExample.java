package ifElseStatements.ifStatements;

import java.util.Scanner;
public class BalanceExample {
    public static void main(String[] args) {

        double balance = 1000;
                // you can use relational and logical operators
                // expression which is going to be true if balance is less than

        boolean isBalanceLessThan0 = balance < 0; // false

        boolean isBalanceEquals100 = balance == 100; // false

        boolean isBalanceBiggerOrEqualThan1000 = balance >= 1000; // false

        //create an expression for checking if balance is not equal to -1

        boolean isBalanceNotEqualToMinus1 = balance != -1; // true



        if(balance < 0){
            // action my code to be executed
            System.out.println("Your balance is under 0.");
        }






    }
}
