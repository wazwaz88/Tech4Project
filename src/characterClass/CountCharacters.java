package characterClass;

import utilities.CharacterHelper;

public class CountCharacters {
    public static void main(String[] args) {

        /*
        TASK-1
        Write a program that counts spaces for below String
        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        Expected result:
        9
 */

        System.out.println("\n---TASK-1---\n");
        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";
        int count = 0;

        for (int i = 0; i < address.length(); i++) {

            if(address.charAt(i) == ' '){
                count++;
            }

        }


        System.out.println(count);




        System.out.println("\n---TASK-2---\n");
        String address2 = "2860 S River Rd Suite 350, Des Plaines IL, 60018";
        int count2 = 0;

        for (int i = 0; i < address2.length(); i++) {

            if(Character.isLetter(address.charAt(i))){
                count2++;
            }

        }


        System.out.println(count2);




        System.out.println("\n---TASK-3---\n");
        String address3 = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        int countLowerCase = 0;
        int countUpperCase = 0;

        for (int i = 1; i <= 2; i++) {

            if(i == 1){
                for (int j = 0; j < address3.length(); j++) {
                    if (Character.isLowerCase(address3.charAt(j))) countLowerCase++;


                }

            }else{
                for (int j = 0; j < address3.length(); j++) {
                    if (Character.isUpperCase(address3.charAt(j))) countUpperCase++;
                }
            }
        }

        int difference = (countLowerCase - countUpperCase);

        System.out.println(difference);


 /*
        TASK-3
        Write a program that counts uppercase and lowercase letters for below String.
        Then, find the difference between lowercase letters and uppercase letters
        Basically, find totalCountOfLowercaseLetters - totalCountOfUppercaseLetters
        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        Expected result:
        9
         */

        System.out.println("\n---TASK-3---\n");

        int countL = 0, countU = 0;
        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if(Character.isUpperCase(c)) countU++;
            else if(Character.isLowerCase(c)) countL++;
        }

        System.out.println(Math.abs(countL - countU));

        System.out.println("\n---TASK-3 - Second Way---\n");

        int count3 = 0;

        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if(Character.isUpperCase(c)) count3++;
            else if(Character.isLowerCase(c)) count3--;
        }

        //String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        System.out.println(Math.abs(count3));

        System.out.println("\n---TASK-3 - Third Way---\n");

        count3 = 0;

        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);

            if(Character.isLetter(c)){
                if(Character.isUpperCase(c)) count3++;
                else count3--;
            }
        }

        System.out.println(count3);

        System.out.println("\n---TASK-4---\n");

/*
TASK-4
Write a program that counts vowel and consonants letters for below String.
Then, print them with below messages

String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

Expected result:
Vowels = 10
Consonants = 15
 */

        int countVowel = 0;
        int countNotVowel = 0;

        for (int i = 0; i < address.length(); i++) {

            if (CharacterHelper.isVowel(address.charAt(i))) countVowel++;
            else if(CharacterHelper.isConsonant(address.charAt(i))) countNotVowel++;

        }

        System.out.println("Vowels = " + countVowel);
        System.out.println("Consonants = " + countNotVowel);



        System.out.println("\n---TASK-4---\n");
/*
TASK-5 - Putting all together
Write a program that characters from the below String.
Then, print them with below messages

String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

Expected result:
Letters = 25
Lowercases = 17
Uppercases = 8
Vowels = 10
Consonants = 15
Digits = 12
Spaces = 9
Specials = 2
 */

        int countLetters = 0;
        int countLower = 0;
        int countUpper = 0;
        int countVowels = 0;
        int countConsonants = 0;
        int countDigits = 0;
        int countSpaces = 0;
        int countSpecials = 0;
        int evenCounter = 0;
        int oddCounter = 0;




        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if (Character.isLetter(c)){
                countLetters++;

                if (Character.isUpperCase(c)) countUpper++;
                else countLower++;

                if(CharacterHelper.isVowel(c)) countVowels++;
                else countConsonants++;

            }else if (Character.isDigit(c)){

                countDigits++;

                if(Integer.parseInt("" + c) % 2 == 0) evenCounter++;
                else oddCounter++;



            }else if (Character.isSpaceChar(c)){

                countSpaces++;

            }else countSpecials++;



        }

        System.out.println("Letters = " + countLetters);
        System.out.println("Lowercases = " + countLower);
        System.out.println("Uppercases = " + countUpper);
        System.out.println("Vowels = " + countVowels);
        System.out.println("Consonants = " + countConsonants);
        System.out.println("Digits = " + countDigits);
        System.out.println("Odd Digits = " + oddCounter);
        System.out.println("Even Digits = " + evenCounter);

        System.out.println("Spaces = " + countSpaces);
        System.out.println("Specials = " + countSpecials);








    }
}
