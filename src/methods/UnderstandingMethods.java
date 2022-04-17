package methods;

import utilities.Calculator;

public class UnderstandingMethods {
    public static void main(String[] args) {

        /*
        println() method is invoked
        this method belongs to System. (every method belongs to a class besides main method)
        that is why it is invoked with the System class name
        this method has a task of printing the variable given in its parentheses (argument/parameter)
            whatever you put in parentheses, you are putting arguments
         */

        Math.max(5, 10); // 5 and 10 are arguments that passed inside the method
        // have to follow rules of methods. has to be two only. two primitives
        // every method has a block of code behind it.


        // introduction
       Introduction.introduce("John Doe", "Programmer", 35, "Java");




       Math.min(5, 10);


        int random = Calculator.getRandomNumber(35, 73);
        System.out.println(random);

    }
}
