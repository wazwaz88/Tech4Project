package methods;

import utilities.MathHelper;

public class FindGreatestOrSmallestOf3Numbers {
    public static void main(String[] args) {


        System.out.println(Math.max(5, Math.max(1, 7)));

        // easier to just put 3 numbers wo 2 math maxes.

       // Math.max(5, 1, 5): //compiler error

        int max = MathHelper.maxOfThree(5, 1, 10);

        System.out.println("Max of three ints = " + max);

        double m1 = MathHelper.maxOfThree(1.1, 1.2, 1.3);

        System.out.println("Max of three doubles = " + m1);


        byte b1 = (byte) (Math.random() * 10);
        byte b2= (byte) (Math.random() * 10);
        byte b3 = (byte) (Math.random() * 10);

        System.out.println("Random number 1 is " + b1);
        System.out.println("Random number 2 is " + b2);
        System.out.println("Random number 3 is " + b3);



        System.out.println(MathHelper.minOfThree(b1, b2, b3));



    }









}
