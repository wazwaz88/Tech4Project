package mathClass;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;
public class MaxAndMin {
    public static void main(String[] args) {


        int x = 4, y = 67, z = -54;

        int xymax = Math.max(x, y);
        int xyzmax = Math.max(xymax, z);
        int xymin = Math.min(x, y);
        int xyzmin = Math.min(xymin, z);


        System.out.println(xymax);

        System.out.println(xyzmax);
        System.out.println(xymin);
        System.out.println(xyzmin);




    /*
    Write a program which is going to print the max of given 3 numbers
    4, 56, 23
    */

        int a = 4;
        int b = 56;
        int c = 23;

        int maxabc = Math.max(Math.max(a, b), c);

        System.out.println(maxabc);

/*
Write a program which is going to ask 4 NUMBER print the max of retrieved 4 numbers.
 */


        Scanner userInput = new Scanner(System.in);

        System.out.println("Input 1st number.");
        int num1 = userInput.nextInt();
        System.out.println("Input 2nd number.");
        int num2 = userInput.nextInt();
        System.out.println("Input 3rd number.");
        int num3 = userInput.nextInt();
        System.out.println("Input 4th number.");
        int num4 = userInput.nextInt();

        System.out.println("The max of the 4 numbers given is = " + Math.max(num1, Math.max(num2, Math.max(num3, num4))));



    }
}
