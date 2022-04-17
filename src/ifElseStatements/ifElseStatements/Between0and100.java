package ifElseStatements.ifElseStatements;

import java.util.Scanner;
public class Between0and100 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a number.");
        int number = userInput.nextInt();

        // and doesn't like false, OR likes true

        boolean inBetween0And100 = number >= 0 && number <= 100;

        if(number >= 0 && number <= 100){
                System.out.println("It is in between 0 and 100.");
        }else{
            System.out.println("It is not in between 0 and 100");
        }


    }
}
