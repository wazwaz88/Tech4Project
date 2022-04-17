package homeworks;

import java.util.Scanner;

public class Homework11{
    public static void main(String[] args) {

        System.out.println("Task 1");

        String s1 = "";

        for (int i = 1; i <= 100; i++) {
            if(i % 7 == 0) s1 += i + " - ";
        }


        System.out.println(s1.substring(0, s1.length() - 3));


        System.out.println("\nTask 2");

        String s2 = "";

        for(int i = 1; i <= 50; i ++){
            if(i % 2 == 0 && i % 3 == 0) s2 += i + " - ";
        }


        System.out.println(s2.substring(0, s2.length() - 3));


        System.out.println("\nTask 3");

        String s3 = "";
        for(int i = 100; i >= 50; i--){
            if(i % 5 == 0) s3+= i + " - ";
        }

        System.out.println(s3.substring(0, s3.length() - 3));


        System.out.println("\nTask 4");

        for(int i = 0; i <= 7; i++){
            System.out.println("The square of " + i + " is = " + (i * i));
        }

        System.out.println("\nTask 5");


        int sum = 0;

        for(int i = 10; i >= 1; i--){
            sum += i;
        }

        System.out.println(sum);

        System.out.println("\nTask 6");

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a positive number");
        int num1 = userInput.nextInt();

        int product = 1;

        if(num1 >= 0){

            for(int i = num1; num1 >= 1; num1--){

                product *= i;
                System.out.println(product);
            }
        }
        System.out.println(product);



        System.out.println("\nTask 7");

        System.out.println("Please enter your first and last name");
        String name = userInput.nextLine();
        userInput.nextLine();

       int count = 0;


        for(int i = 0; i <= name.length() - 1; i++){
            if(name.charAt(i) == 'A' || name.charAt(i) == 'a' || name.charAt(i) == 'E' ||name.charAt(i) == 'e' ||
                    name.charAt(i) == 'I' || name.charAt(i) == 'i' || name.charAt(i) == 'O' || name.charAt(i) == 'o' ||
                    name.charAt(i) == 'U' || name.charAt(i) == 'u'){
                count++;
            }

        }

        System.out.println("There are " + count + " vowel letters in this full name");








        System.out.println("\nTask 10");

        String name2; // why do we declare variable outside?

        do{
            System.out.println("Please enter a name");
            name2 = userInput.next();

        }while(!(name2.charAt(0) == 'j') && name2.charAt(0) != 'J'); // why do we use and not or?


        System.out.println("End of Program");













    }
}
