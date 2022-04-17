package methods;

import utilities.Calculator;

public class TestingCalculator {
    public static void main(String[] args) {

        int i1 = 15, i2 = 2;

        int result = Calculator.divide(i1, i2); // returns an int.


        System.out.println(result);


        double d1 = 15, d2 = 2;

        double resultDouble = Calculator.divide(d1, d2);

        System.out.println(resultDouble);

        Introduction.introduce("Wazwaz", "Tester", 20, "Books");
        // it cannot be put into a variable. it is not returning one specific variable. it technically returns something
        // returns multiple variable Types, bc of this you put void. just returns the data
        //also you can put non-void statements in print statements directly
        // you cannot put void statements in print statement directly





    }









}
