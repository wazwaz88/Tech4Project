package stringMethods;

public class _10_substring {
    public static void main(String[] args) {
        /*
        Method Task: They are used to extract a substring from a larger string
        -They are non-static, and we call them with objects
        -They are return type, and they return another string
        -There are 2 overloaded substring methods
            1. substring(int beginIndex)
               -This method takes begin index as an argument, and it extracts a substring starting from given index
               to the end
            2. substring(int beginIndex, int endIndex)
               -This method will take 2 args to define which index to start and which index to stop to extract
               a substring
               NOTE: beginIndex is inclusive but endIndex is exclusive
               NOTE: if your beginIndex is equal to endIndex, then it will return empty string
               NOTE: if your beginIndex is less than endIndex, then it will throw StringIndexOutOfBoundsException
         */




        String result = "About 3,520,000,000 results (0.82 seconds)";

        String num = result.substring(6, 19);


        System.out.println(num);


        // Use substring to get parentheses


        String time = result.substring(28); // no second number bc it automatically includes everything to the end.

        System.out.println(time);

        //or
        System.out.println("Be creative");

        System.out.println(result.substring(result.indexOf('(')));





    }
}
