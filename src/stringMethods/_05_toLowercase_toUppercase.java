package stringMethods;

public class _05_toLowercase_toUppercase {
    public static void main(String[] args) {

        /*
        Method Task: These methods are used to convert letters of a String to uppercase or lowercase
        -They are non-static methods that you can call them with objects of String class
        -They are return type methods, and they return the modified String object back
        -They don't take any argument
         */



        String s1 = "HELLO world 10$";

        System.out.println(s1);
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());


        System.out.println("ads;lfkj oiu laks;jdf asluif lk;jasf oiasudflh ".toUpperCase());



        String sentence = "I paid $100.99 to buy airpods";

        String s2 = sentence.toLowerCase();
        String s3 = sentence.toUpperCase();


    }
}
