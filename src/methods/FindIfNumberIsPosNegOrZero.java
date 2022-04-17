package methods;

        import utilities.MathHelper;
        import utilities.ScannerHelper;

        import java.util.Scanner;
public class FindIfNumberIsPosNegOrZero {
    public static void main(String[] args) {
        /*
        ask user to enter a number
         */


        int num = ScannerHelper.getNumberFromUser();

        if (MathHelper.isNegative(num)){
            System.out.println("The number is negative");
        }else if(MathHelper.isPositive(num)){
            System.out.println("The number is positive");
        }else{
            System.out.println("The number is zero");
        }






    }
}
