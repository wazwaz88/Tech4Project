package projects;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Project03 {
    public static void main(String[] args) {

        System.out.println("Task 1\n");

        String s1 = "24", s2 = "5";

        int iS1 = Integer.parseInt(s1);
        int iS2 = Integer.parseInt(s2);

        System.out.println("The sum of " + s1 + " and " + s2 + " = " + (iS1 + iS2));
        System.out.println("The subtraction of " + s1 + " and " + s2 + " = " + (iS1 - iS2));
        System.out.println("The division of " + s1 + " and " + s2 + " = " + ((double) iS1 / iS2));
        System.out.println("The multiplication of " + s1 + " and " + s2 + " = " + (iS1 * iS2));
        System.out.println("The remainder of " + s1 + " and " + s2 + " = " + (iS1 % iS2));


        System.out.println("\nTask 2\n");

        int random = (int) (Math.random() * 35 + 1);

        System.out.println(random);

        if(random == 2 || random == 3 || random == 5 || random == 7 || random == 11 || random == 13 || random == 17 || random == 19 ||
                random == 23 || random == 29 || random == 31){
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        }else{
            System.out.println("THE NUMBER IS NOT A PRIME NUMBER");
        }


        System.out.println("\nTask 3\n");

        int random1 = (int) (Math.random() * 50 + 1);
        int random2 = (int) (Math.random() * 50 + 1);
        int random3 = (int) (Math.random() * 50 + 1);

        int lowest = Math.min(random1, Math.min(random3, random2));
        int greatest = Math.max(random1, Math.max(random3, random2));

        System.out.println("Lowest number is = " + lowest);

        if(random1 > random2 && random1 < random3){
            System.out.println("Middle number is = " + random1);
        }else if(random2 > random1 && random2 < random3){
            System.out.println("Middle number is = " + random2);
        }else{
            System.out.println("Middle number is = " + random3);

        }

        System.out.println("Greatest number is = " + greatest);







        System.out.println("\nTask 4\n");

        char c = '#';

        if(c >= 97 && c <= 122){
            System.out.println("The letter is lowercase");
        }else if(c >= 65 && c <= 90){
            System.out.println("The letter is uppercase");
        }else{
            System.out.println("Invalid character detected!!!");
        }







        System.out.println("\nTask 5\n");

        char c2 = 'Z';

        if(c2 == 65 || c2 == 69 || c2 == 73 || c2 == 79 || c2 == 85 || c2 == 97 || c2 == 101 || c2 == 105 || c2 == 111 ||
                c2 == 117){
            System.out.println("The letter is vowel");
        }else if (c2 <= 64 || (c2 >=91 && c2 <= 96) || c2 >= 123){
            System.out.println("Invalid character detected!!!");
        }else{
            System.out.println("The letter is consonant");
        }


        System.out.println("\nTask 6\n");

        char specialCharacter = '*';

        if((specialCharacter >= 32 && specialCharacter <= 47) || (specialCharacter >= 58 && specialCharacter <= 64)
        || (specialCharacter >= 91 && specialCharacter <= 96) || specialCharacter >= 123){
            System.out.println("Special character is = " + specialCharacter);
        }else{
            System.out.println("Invalid Character detected!!!");
        }


        System.out.println("\nTask 7\n");

        char task7 = '*';

        if((task7 >= 32 && task7 <= 47) || (task7 >= 58 && task7 <= 64)
                || (task7 >= 91 && task7 <= 96) || task7 >= 123){
            System.out.println("Character is a special character");
        }else if((task7 >= 97 && task7 <= 122) || (task7 >= 65 && task7 <= 90)){
            System.out.println("Character is a letter");
        }else{
            System.out.println("Character is a digit");
        }










    }
}
