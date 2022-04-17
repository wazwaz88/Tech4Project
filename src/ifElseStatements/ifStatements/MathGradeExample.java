package ifElseStatements.ifStatements;

import java.util.Scanner;
public class MathGradeExample {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Hey David! Please enter your math grade?");
        String davidsGrade = userInput.next();

        int davidsIntGrade = Integer.parseInt(davidsGrade); // example of string to int

        if (Integer.valueOf(davidsGrade) >= 60){
            System.out.println("Awesome! You have passed the math class!");
        } else{
            System.out.println("Go back to school!");
        }


    }
}
