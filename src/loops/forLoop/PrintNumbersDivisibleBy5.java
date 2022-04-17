package loops.forLoop;

import utilities.Calculator;

public class PrintNumbersDivisibleBy5 {
    public static void main(String[] args) {




        for(int number = 1; number <= 50; number++ ){
            if(number % 5 == 0){
                System.out.println(number);
            }
        }



    }
}
