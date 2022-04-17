package operator.incrementAndDecrement;

public class PreIncrementAndPostIncrement {
    public static void main(String[] args) {

        int a = 10;

        //these 3 are the same
       // a = a + 1; //should not use
       // a += 1; //not going to use for adding 1.
        //a++;

        // both of these add 1, but the difference is when they are adding 1. one is adding immediately, one is adding
        // after.
       // a++; // a=11 = 10+1. takes time to add. post increment value. how long? will learn
       // ++a; // a=12 = 11 + 1. adds immediately.


        System.out.println(a++);
        // gets added in the code after the second plus sign. so when a is used again, it will be 11.
        System.out.println(a);

        System.out.println(++a);





    }
}
