package homeworks;

import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args) {

        System.out.println("Task 1\n");

        int random1 = (int) (Math.random() * 51);

        System.out.println(random1);

        if(random1 >= 10 && random1 <= 25){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        System.out.println("\nTask 2\n");

        int random2 = (int) (Math.random() * 100 + 1);

        System.out.println(random2);

        if(random2 >= 1 && random2 <= 50){
            System.out.println(random2 + " is in the 1st half");

            if(random2 <= 25){
                System.out.println(random2 + " is in the 1st quarter");
            }else{
                System.out.println(random2 + " is in the 2nd quarter");
            }

        }else{
            System.out.println(random2 + " is in the 2nd half");

                if(random2 >= 51 && random2 <= 75){
                    System.out.println(random2 + " is in the 3rd quarter");
                }else{
                    System.out.println(random2 + " is in the 4th quarter");


                }
        }



        System.out.println("\nTask 3\n");

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter 5 numbers between 1 and 10");
        int num1 = userInput.nextInt(), num2 = userInput.nextInt(), num3 = userInput.nextInt(),
                num4 = userInput.nextInt(), num5 = userInput.nextInt();

        if(num1 >= 1 && num1 <= 10){
            num1 = num1 * 5;
        }else{
            num1 = num1 * 0;
        }if(num2 >= 1 && num2 <= 10){
            num2 = num2 * 4;
        }else{
            num2 = num2 * 0;
        }if(num3 >= 1 && num3 <= 10){
            num3 = num3 * 3;
        }else{
            num3 = num3 * 0;
        }if(num4 >= 1 && num4 <= 10){
            num4 = num4 * 2;
        }else{
            num4 = num4 * 0;
        }if(num5 >= 1 && num5 <= 10){
            num5 = num5 * 1;
        }else{
            num5 = num5 * 0;
        }




        System.out.println(num1 + num2 + num3 + num4 + num5);





    }
}
