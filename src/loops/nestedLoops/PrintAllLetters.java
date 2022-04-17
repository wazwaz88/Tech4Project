package loops.nestedLoops;

public class PrintAllLetters {
    public static void main(String[] args) {
/*
// separate loops solution

        System.out.println("Lowercase");
        for (int a = 97; a <= 122 ; a++) {
            System.out.print((char) a + " ");

        }

        System.out.println(" \nUppercase");
        for (int a = 65; a <= 90 ; a++) {
            System.out.print((char) a + " ");

        }

*/

        // nested loop solution

        for (int i = 1; i <= 2; i++) {
            int start = 97;
            if (i == 1){
                System.out.println("\nLowercase Letters");

            }
            else {
                System.out.println("Uppercase Letters");
                start = 65;
            }

            for (int j = start; j <= start + 25; j++) {
                System.out.println((char) j);
            }



        }



    }
}
