package operator.incrementAndDecrement;

public class Exercise1 {
    public static void main(String[] args) {


        int i = 5;
        int age = 10 * (i++);

        System.out.println(age);

        age = 10 * i;

        System.out.println(age);

        int j = 5;
        int age2 = 10 * (++j);
        System.out.println(age2);

    }
}
