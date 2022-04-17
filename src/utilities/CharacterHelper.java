package utilities;

public class CharacterHelper {

    //Task 1

    public static boolean isSpace(char letter){
        return letter == ' ';
    }

    //Task 2


    public static boolean isDigit(char digit){
        return digit >= 48 && digit <= 57;
    }

    //Task 3
    public static boolean isUppercase(char letter){
        return letter >= 65 && letter <= 90;
    }


    //Task 4
    public static boolean isLowercase(char letter){
        return letter >= 97 && letter <= 122;
    }


    //Task 5
    public static boolean isLetter(char letter){
        return CharacterHelper.isUppercase(letter) || CharacterHelper.isLowercase(letter);
    }

    //Task 6
    public static boolean isVowel(char letter){
        return letter == 65 || letter == 69 || letter == 73 || letter == 79 || letter == 85 || letter == 97 ||
                letter == 101 || letter == 105 || letter == 111 || letter == 117;
    }

    //Task 7
    public static boolean isConsonant(char letter){
        return !CharacterHelper.isVowel(letter) && CharacterHelper.isLetter(letter);
    }


}
