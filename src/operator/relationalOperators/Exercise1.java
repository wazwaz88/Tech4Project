package operator.relationalOperators;

public class Exercise1 {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        int z = 10;

        boolean b1 = y < z;
        boolean b2 = x <= y;
        boolean b3 = x >= z;
        boolean b4 = y > x;
        boolean b5 = x >= y;
        //boolean b6 = x >= z < y;


        System.out.println("y < z: " + b1);
        System.out.println("x <= y: " + b2);
        System.out.println("x >= z: " + b3);
        System.out.println("y > x: " + b4);
        System.out.println("x >= y: " + b5);
        //System.out.println("(x + z) < y: " + b6);













    }
}
