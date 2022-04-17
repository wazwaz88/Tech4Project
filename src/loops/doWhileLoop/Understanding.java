package loops.doWhileLoop;

import java.util.Random;

public class Understanding {
    public static void main(String[] args) {

        boolean b = true;

        while(b){
            System.out.println("true");
            b = false;
        }


        boolean b2 = false;


        do{
            System.out.println("true"); // executes block of code at least once.
        }while(b2);



    }
}
