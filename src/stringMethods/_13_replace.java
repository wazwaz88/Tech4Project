package stringMethods;

public class _13_replace {
    public static void main(String[] args) {
        /*
        Method Task: It is used to replace some values in a String with another value
        NOTE: it replaces all the occurrences.
        -It is non-static
        -It is a return type and returns another which is modified
        -It takes 2 arguments(char or String)
         */




        String sentence = "Can I can a can?";

        String replace = sentence.replace("can", "xxx");

        System.out.println(replace);

        String s = "banana";
        System.out.println(s.replace('a', '$'));

        String name = "John";
        System.out.println(name.replace("o", "ooo"));

        System.out.println("hello".replace("good", "nice"));



    }
}
