package mathClass;

public class ExerciseMathRandom {
    public static void main(String[] args) {
        /*
        Create a program which is generation a random number between 45 - 98
         */

        double random = Math.random();

        int random0 = (int) (Math.random() * (98 - 45 + 1) + 45);

        System.out.println(random0);


        int random1 = (int) (Math.random() * 19 + 67);
        int random2 = (int) (Math.random() * 19 + 67);

        System.out.println(random1);
        System.out.println(random2);

        System.out.println(Math.max(random1, random2));
        System.out.println(Math.min(random1,random2));

















    }
}
