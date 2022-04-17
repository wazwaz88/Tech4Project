package ifElseStatements.ifElseIfStatement;

public class Exercise2 {
    public static void main(String[] args) {


        int num = (int)  (Math.random() * 21 ) - 10;

        System.out.println(num);


        if (num < 0){
            System.out.println("Number is negative");
        }else if(num > 0){
            System.out.println("Number is positive");
        }else{
            System.out.println("Number is 0");
        }





    }
}
