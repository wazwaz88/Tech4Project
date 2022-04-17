package characterClass;

import utilities.CharacterHelper;

public class UnderstandingCharacterClass {
    public static void main(String[] args) {


        boolean b = Character.isDigit('9');

        System.out.println(b);


        System.out.println(Character.isDigit('9'));

        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isUpperCase('B'));

        System.out.println(Character.isLowerCase('G'));
        System.out.println(Character.isLowerCase('h'));

        System.out.println(Character.isLetter('l'));
        System.out.println(Character.isLetter('Z'));

        System.out.println(Character.isLetterOrDigit('5'));
        System.out.println(Character.isLetterOrDigit('t'));
        System.out.println(Character.isLetterOrDigit(' '));

        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isSpaceChar(' '));

        char c2 = '_';

        System.out.println(!Character.isLetterOrDigit(c2) && !Character.isSpaceChar(' ')); // true


        char c3 = 'A';

        String s = "AEOUIaeoui";

        System.out.println(s.contains(c3 + ""));

        char c4 = 'a';
        boolean isC4Vowel = false;
        int sum = 0;
        int product = 1;
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (c4 == s.charAt(i)) {
                isC4Vowel = true;
                break;
            }
        }

        if(isC4Vowel) System.out.println("c4 is Vowel");
        else System.out.println("c4 is not Vowel");


        String s2 = "ab1x2y3cd3dsjfhw43";
        // 1+2+3+3+4+3 = 16;
        // 49+50+51+51+52+51 = 304;
        int sum2 = 0;
        for(int i = 0; i < s2.length(); i++){
            char c = s2.charAt(i);
            if(Character.isDigit(c)){
                sum2 += Integer.parseInt(String.valueOf(c));
            }
        }


        System.out.println(sum2);




        sum2 = 0;


        s2 = "ab1x2y3cd3dsjfhw43";


        for(int i = 0; i < s2.length(); i++){
            char c = s2.charAt(i);

            if(Character.isDigit(c) && Character.isDigit(s2.charAt(i + 1))){
                sum2 += Integer.parseInt("" + c) + Integer.parseInt("" + c + 1);
            }else if(Character.isDigit(c)){
                sum2 += Integer.parseInt(String.valueOf(c));
            }
        }


        System.out.println(sum2);


    }
}
