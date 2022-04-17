package operator.relationalOperators;

public class RelationalOperators {
    public static void main(String[] args) {


            //RELATIONAL OPERATORS ARE ONLY WITH PRIMITIVES.
        int a = 4;
        int b = 10;

        boolean isAEqualToB = a == b;
        boolean isANotEqualToB = a != b;

        System.out.println("a = b : " + isAEqualToB);
        System.out.println("a != b : " + isANotEqualToB);

        boolean isAGreatherThanB = a > b;
        boolean isALessThanB = a < b;
        boolean isAGreaterOrEqualThanB = a >= b;
        boolean isALessOrEqualThanB = a <= b;

        System.out.println("a > b : " + isAGreatherThanB);
        System.out.println("a < b : " + isALessThanB);
        System.out.println("a >= b : " + isAGreaterOrEqualThanB);
        System.out.println("a >= b : " + isALessOrEqualThanB);

        int x = 3;
        int y = 5;
        int z = 9;

        boolean bool = x + y == --z;
        boolean boo2  = x + y + 1 == z;

        System.out.println("Naim's question: " + x + (y == --z));





    }
}
