package projects;

import utilities.Calculator;
import utilities.ScannerHelper;
import utilities.StringHelper;

import java.util.Scanner;

public class Project05 {
    public static void main(String[] args) {


        System.out.println("Task 1 \n");

        Scanner userInput = new Scanner(System.in);

        String str = ScannerHelper.getStringFromUser();

        String strA = str.substring(0, 4), strB = str.substring(4, str.length() - 4), strC = str.substring(str.length() - 4);



        if (str.length() < 8){
            System.out.println("This String does not have 8 characters");
        }else{
            System.out.println(strC + strB + strA);
        }



        System.out.println("Task 2 \n");

        String sentence = ScannerHelper.getStringFromUser();



        if(sentence.isEmpty()){
            System.out.println("This sentence does not have 2 or more words to swap");
        }else{
            String strAA = sentence.substring(0, sentence.indexOf(" "));
            String strCC = sentence.substring(sentence.indexOf(" "), sentence.lastIndexOf(" ") + 1);
            String strBB = sentence.substring(sentence.lastIndexOf(" ") + 1);

            System.out.println(strBB + strCC + strAA);
        }





        System.out.println("Task 3 \n");

        String str1 = "These books ares so stupid", str2 = "I like idiot behaviors",
                str3 = "I had some stupid t-shirts in the past and also some idiot look shoes";



            if(str1.contains("stupid") || str1.contains("idiot")){
                System.out.println(str1.replace("stupid", "nice").replace("idiot", "nice"));
            }
            if(str2.contains("stupid") || str2.contains("idiot")) {
                System.out.println(str2.replace("stupid", "nice").replace("idiot", "nice"));
            }
            if(str3.contains("stupid") || str3.contains("idiot")){
                System.out.println(str3.replace("stupid", "nice").replace("idiot", "nice"));
            }



        System.out.println("\nTask 4 \n");

        String name = ScannerHelper.getNameFromUser();

        if(name.length() % 2 == 0  && name.length() > 2){
            System.out.println(StringHelper.getMiddle(name));

        }else if(name.length() % 2 == 1  && name.length() > 2){
            System.out.println(StringHelper.getMiddle(name));
        }else{
            System.out.println("Invalid Input!!!");
        }


        System.out.println("\nTask 5 \n");

        String country = ScannerHelper.getStringFromUser();

        if (country.length() < 5){
            System.out.println("Invalid Input!!!");
        }else{
            System.out.println(country.substring(2, country.length() - 2));
        }



        System.out.println("\nTask 6 \n");

        String address = ScannerHelper.getAddressFromUser();

        System.out.println(address.replace("a", "*").replace("A", "*").replace("e", "#")
                .replace("E", "#").replace("i", "+").replace("I", "+")
                .replace("u", "$").replace("U", "$").replace("o", "@")
                .replace("O", "@"));







        System.out.println("\nTask 7 \n");

        int random1 = Calculator.getRandomNumber(0, 25);
        int random2 = Calculator.getRandomNumber(0, 25);

        System.out.println(random1);
        System.out.println(random2);


        for(int number = random1; number <= random2; number++){
            if(number % 5 != 0){
                System.out.println(number);
            }
        }

        for(int number = random2; number <= random1; number++){
            if(number % 5 != 0){
                System.out.println(number);
            }
        }



    }

}
