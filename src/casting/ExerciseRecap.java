package casting;

import java.util.Scanner;

public class ExerciseRecap {
    public static void main(String[] args) {




        Scanner input = new Scanner(System.in);


        System.out.println("Please enter your name:");
        String fullName = input.nextLine();

        System.out.println("Please enter your age:");
        String age = input.next();

        input.nextLine();
        System.out.println("Please enter your phone number:");
        String phoneNumber = input.nextLine();

        System.out.println("Enter the ages of your three kids:");
        //String kid1 = input.next();
        //String kid2 = input.next();
       // String kid3 = input.next();

        int ageKid1 = Integer.parseInt(input.next());
        int ageKid2 = Integer.parseInt(input.next());
        int ageKid3 = Integer.parseInt(input.next());

        int oldestKid = Math.max(ageKid1, Math.max(ageKid2, ageKid3));
        int youngestKid = Math.min(ageKid1, Math.min(ageKid2, ageKid3));


        System.out.println("Your name is " + fullName + ", your phone number is " + phoneNumber + "," +
                "\nYou are " + age + " years old, your oldest kid is " + oldestKid +
                ", your \nyoungest is " + youngestKid + ", difference between oldest " +
                "and youngest is " + (oldestKid - youngestKid)
                + " \nyears.");

    }
}
