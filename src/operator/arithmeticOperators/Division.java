package operator.arithmeticOperators;

public class Division {
    public static void main(String[] args){


        double num1 = 15;
        double num2 = 3;
        int num3 = 4;
        int num4 = 10;

        double division = num1 / num2;
        double divisionByInt = num1 / num3;
        double divisionByDouble = num4 / num2;

        System.out.println("num1 / num2 = " + division); // double / double
        System.out.println("num1 / num3 = " + divisionByInt); // double / Int
        System.out.println("num4 / num2 = " + divisionByDouble); // int/ double

        System.out.println("num1 / num2 = " + num1 / num2); // double / double
        System.out.println("num1 / num3 = " + num1 / num3); // double / Int
        System.out.println("num4 / num2 = " + num4 + num2); // int/ double
        System.out.println("num4 / num2 = " + (num4 + num2));


    }
}
