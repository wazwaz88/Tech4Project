package utilities;

public class Calculator {

    /**
    what do we need to create a method
    1. a proper name
    2. decide its accessibility (1. public- access it everywhere in the project. 2. private - only in a certain class.
                                3. default[not putting either]- exists in the package. 4. protected- mix of all of them)
    3. Decide its accessibility way/level (you want to call it with class name or with object name)
            static - call with class name
            non-static - call it with object name (take out static, to become non-static)
    4. decide if it returns something or not
        if it returns - decide what it returns
        if it doesn't - then put void

            NOTE: if your method is not void meaning it is returning something you MUST use return keyword in the body
            of the method.

    5. Does it take any argument?
        yes - put in parentheses
        no - nothing in parentheses

            NOTE: if your method returns an int, then the variable used next to return keyword in the body
            NOTE: Every method must have a body that runs a task
            NOTE: We can have multiple methods sharing the same name in the same name class only if they have different
            arguments. Different arguments could be either the number of arguments are different or the types of arguments
            NOTE: DO NOT EVER CREATE A METHOD INSIDE ANOTHER METHOD!!!
     */


    public static int divide(int num1, int num2){ // - 15,2 = 7. not 7.5.
        return Math.max(num1, num2) / Math.min(num1, num2);
    }

    public static double divide(double num1, double num2){
        return Math.max(num1, num2) / Math.min(num1, num2);
    }


    public static int multiply(int num1, int num2){
        return num1 * num2;
    }

    public static double multiply(double num1, double num2){
        return num1 * num2;
    }


    public static int sum(int num1, int num2){
        return num1 + num2;
    }

    public static double sum(double num1, double num2){
        return num1 + num2;
    }


    public static int absoluteDifference(int num1, int num2){
        return Math.abs(num1 - num2);
    }

    public static double absoluteDifference(double num1, double num2){
        return Math.abs(num1 - num2);
    }


    public static int averageOfThree(int num1, int num2, int num3){
        return (num1 + num2 + num3) / 3;
    }

    public static int averageOfFour(int num1, int num2, int num3, int num4){
        return (num1 + num2 + num3 + num4) / 4;
    }


    public static int getRandomNumber(int start, int end){
        return (int) (Math.random() * (end - start + 1)) + start;
    }






}
