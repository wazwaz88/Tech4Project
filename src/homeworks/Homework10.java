package homeworks;

public class Homework10 {
    public static void main(String[] args) {


        System.out.println("Task 1");

        String str = "lllll";

        if(str.length() == 0){
            System.out.println("Length is zero");
        }else{
            System.out.println("Length is = " + str.length());
            System.out.println("First char is = " + str.charAt(0));
            System.out.println("Last char is = " + str.charAt(str.length() - 1));

            if(str.contains("A") || str.contains("a") || str.contains("E") || str.contains("e") || str.contains("I")
                    || str.contains("i") || str.contains("O") || str.contains("o") || str.contains("U")
                    || str.contains("u")){
                System.out.println("This String has vowel");
            }else{
                System.out.println("This String does not have vowel");
            }


        }

        System.out.println("\nTask 2\n");

        String str2 = "civic";


        if(str2.length() < 3){
            System.out.println("Length is less than 3");
        }else{

            System.out.println((str2.length() % 2 == 0) ? "" + str2.charAt(str2.length() / 2 -1) + str2.charAt(str2.length() / 2) :
                    "" + str2.charAt(str2.length() / 2));

        }


        System.out.println("\nTask 3\n");


        String s1 = "Python";

        if(s1.length() < 4){
            System.out.println("INVALID INPUT");
        }else{
            String s1A = s1.substring(0, 2);
            String s1B = s1.substring(2, s1.length() - 2);
            String s1C = s1.substring(s1.length() - 2);

            System.out.println("First 2 characters are = " + s1A);
            System.out.println("Last 2 characters are = " + s1C);
            System.out.println("The other characters are = " + s1B);

        }


        System.out.println("\nTask 4\n");

        String s2 = "xyzabcxy";

        if(s2.length() < 2){
            System.out.println("Length is less than 2");
        }else{

            if(s2.substring(0, 2).equals(s2.substring(s2.length() - 2))){
                System.out.println(true);
            }else{
                System.out.println(false);
            }

        }


        System.out.println("\nTask 5\n");

        String string1 = "Yellow";
        String string2 = "Red";

        if(string1.length() < 2 || string2.length() < 2){
            System.out.println("Invalid Input!");
        }else{
            string1 = string1.substring(1, string1.length() - 1);
            string2 = string2.substring(1, string2.length() - 1);
            String string3 = string1 + string2;
            System.out.println(string3);
        }


        System.out.println("\nTask 6\n");

        String stringTask6 = "xxbluexx";

        if(stringTask6.length() < 4){
            System.out.println("INVALID INPUT");
        }else{
            if (stringTask6.startsWith("xx") && stringTask6.endsWith("xx")){
                System.out.println(true);
            }else{
                System.out.println(false);
            }


        }



    }
}
