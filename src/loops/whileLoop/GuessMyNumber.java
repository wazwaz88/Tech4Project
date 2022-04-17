package loops.whileLoop;



import java.util.Random;

public class GuessMyNumber {
    public static void main(String[] args) {


        Random random = new Random();
        int myNumber = random.nextInt(10) + 1;

        System.out.println("The random number is = " + myNumber);

        int usersNumber = random.nextInt(10) + 1;

        int attempt = 1;

        while(usersNumber != myNumber){
            System.out.println("My random attempt number is = " + usersNumber);
            usersNumber = random.nextInt(10) + 1;
            attempt++;
        }


        System.out.println("Finally you could find the number!");
        System.out.println("You could find it after " + attempt + " times!!!");






    }
}
