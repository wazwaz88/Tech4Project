package ifElseStatements.ifElseIfStatement;

public class Exercise1 {

    public static void main(String[] args) {


        int num = (int)  (Math.random() * 21 ) - 10;

        System.out.println(num);


        if (num < 0){
            System.out.println("Number is negative");
        }

        if (num > 0){
            System.out.println("Number is positive");
        }

        if (num == 0){
            System.out.println("Number is 0");
        }




    }
}
