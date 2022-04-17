package casting;

public class CastingPrimitives {
    public static void main(String[] args) {

        /*
        double > float > long > int > char > short > byte
         */

        // implicit casting
        int myInt = 32;
        long myLong = myInt;

        myInt = (int) myLong;  // explicit casting


        int mySecondInt = 'B'; // implicit
        char myChar = (char) 56;
        char mySecondChar = 56;

        int myThirdInt = (int) 45.4; // SAY THE DATA TYPE YOU WANT TO CONVERT, NOT THE OTHER ONE

        short myShort = (short) myChar;


        byte num1 = 45;
        int num2 = num1; //implicit

        int num3 = 46;
        byte num4= (byte) num3; //explicit


        int num5 = 45;
        short num6 = 34;

        char c = (char) num5;
        c = (char) num6; // we have to cast for both because char should be positive everytime


    }
}
