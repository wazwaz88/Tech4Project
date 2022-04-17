package stringMethods;

import java.util.Scanner;

public class _12_contains {
    public static void main(String[] args) {
        /*
        Method Task: it is used to find out if a string contains another string or letter.
        -It is non-static, and we can call it with an object
        -it is a return type, and it returns a boolean
        -it takes a string argument
         */


        String s = "Good morning!";
        System.out.println(s.contains("Good"));
        System.out.println(s.contains(""));
        System.out.println(s.contains("123"));
        System.out.println(s.contains(s));
        System.out.println(s.contains("good"));


        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter your address");
        String address = userInput.nextLine();

        if(address.toUpperCase().contains("CHICAGO")){
            System.out.println("You are in the club");
        }else{
            System.out.println("You are not in the club");
        }








    }
}
