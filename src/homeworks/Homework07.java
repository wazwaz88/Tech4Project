package homeworks;

import sun.text.resources.cldr.zh.FormatData_zh_Hans_MO;

import java.util.Scanner;
public class Homework07 {
    public static void main(String[] args) {


        System.out.println("Task 1\n");

        int random1 = (int) (Math.random() * 11);
        int random2 = (int) (Math.random() * 11);
        int random3 = (int) (Math.random() * 11);
        int random4 = (int) (Math.random() * 11);

        System.out.println("Number 1 = " + random1);
        System.out.println("Number 2 = " + random2);
        System.out.println("Number 3 = " + random3);
        System.out.println("Number 4 = " + random4);


        System.out.println("Absolute difference of " + random1 + " with 5 is = " + Math.abs(random1 - 5));
        System.out.println("Absolute difference of " + random2 + " with 5 is = " + Math.abs(random2 - 5));
        System.out.println("Absolute difference of " + random3 + " with 5 is = " + Math.abs(random3 - 5));
        System.out.println("Absolute difference of " + random4 + " with 5 is = " + Math.abs(random4 - 5));


        System.out.println("Greatest number is = " + Math.max(Math.max(Math.max(random1, random2), random3), random4));
        System.out.println("Smallest number is = " + Math.min(Math.min(Math.min(random1, random2), random3), random4));

        System.out.println("\nTask 2\n");

        int random5 = (int) (Math.random() * 101) - 50;
        int random6 = (int) (Math.random() * 101) - 50;
        int random7 = (int) (Math.random() * 101) - 50;
        int random8 = (int) (Math.random() * 101) - 50;
        int random9 = (int) (Math.random() * 101) - 50;
        int random10 = (int) (Math.random() * 101) - 50;
        int random11 = (int) (Math.random() * 101) - 50;
        int random12 = (int) (Math.random() * 101) - 50;

        int randomGreatest = Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max
                (random5, random6), random7), random8), random9), random10), random11),random12);

        int randomSmallest = Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(Math.min
                (random5, random6), random7), random8), random9), random10), random11),random12);


        System.out.println("Number 1 = " + random5);
        System.out.println("Number 2 = " + random6);
        System.out.println("Number 3 = " + random7);
        System.out.println("Number 4 = " + random8);
        System.out.println("Number 5 = " + random9);
        System.out.println("Number 6 = " + random10);
        System.out.println("Number 7 = " + random11);
        System.out.println("Number 8 = " + random12);

        System.out.println("Greatest number is = " + randomGreatest);

        System.out.println("Smallest number is = " + randomSmallest);

        System.out.println("Average of 8 numbers is = " + (random5 + random6 + random7 + random8 + random9 + random10 +
        random11 + random12) / 8);


        System.out.println("Absolute difference between smallest and greatest is = "
                + Math.abs(randomSmallest - randomGreatest));

        if(random7 < 0){
            System.out.println("3rd number is positive = false");
        }else{
            System.out.println("3rd number is positive = true");
        }

        if(random9 < 0){
            System.out.println("5th number is positive = false");
        }else{
            System.out.println("5th number is positive = true");
        }


        if(random5 == 0){
            System.out.println("There is at least one zero among those numbers is = true");
        }else if(random6 == 0){
            System.out.println("There is at least one zero among those numbers is = true");
        }else if(random7 == 0){
            System.out.println("There is at least one zero among those numbers is = true");
        }else if(random8 == 0){
            System.out.println("There is at least one zero among those numbers is = true");
        }else if(random9 == 0){
            System.out.println("There is at least one zero among those numbers is = true");
        }else if(random10 == 0){
            System.out.println("There is at least one zero among those numbers is = true");
        }else if(random11 == 0){
            System.out.println("There is at least one zero among those numbers is = true");
        }else if(random12 == 0){
            System.out.println("There is at least one zero among those numbers is = true");
        }else{
                System.out.println("There is at least one zero among those numbers is = false");
        }


        System.out.println("\nTask 3\n");


        System.out.println("Enter 7 numbers between 0 and 50. (0 and 50 both included)");

        Scanner userInput = new Scanner(System.in);
        int num1 = userInput.nextInt(), num2 = userInput.nextInt(), num3 = userInput.nextInt(), num4 = userInput.nextInt(),
                num5 = userInput.nextInt(), num6 = userInput.nextInt(), num7 = userInput.nextInt();

        int numGreatest = Math.max(num1, Math.max(num2, Math.max(num3, Math.max(num4, Math.max(num5, Math.max(num6, num7))))));

        int numSmallest = Math.min(num1, Math.min(num2, Math.min(num3, Math.min(num4, Math.min(num5, Math.min(num6, num7))))));


        System.out.println("Number 1 = " + num1);
        System.out.println("Number 2 = " + num2);
        System.out.println("Number 3 = " + num3);
        System.out.println("Number 4 = " + num4);
        System.out.println("Number 5 = " + num5);
        System.out.println("Number 6 = " + num6);
        System.out.println("Number 7 = " + num7);

        System.out.println("Greatest number is = " + numGreatest);
        System.out.println("Smallest number is = " + numSmallest);

        System.out.println("Average of 7 numbers is = " + (num1 + num2 + num3 + num4 + num5 + num6 +
                num7) / 7);

        if(num1 >= 10){
            System.out.println("First number is greater than or equal to 10 = true");
        }else{
            System.out.println("First number is greater than or equal to 10 = false");
        }

        if(num7 <= 40){
            System.out.println("Last number is less than or equal to 40 = true");
        }else{
            System.out.println("Last number is less than or equal to 40 = false");
        }

        if(num1 > 25 && num7 > 25){
            System.out.println("Both first and last numbers are greater than 25 = true");
        }else{
            System.out.println("Both first and last numbers are greater than 25 = false");
        }

        if(num1 == 0 || num1 == 50){
            System.out.println("At least one of those numbers is 0 and 50 = true");
        }else if(num2 == 0 || num2 == 50) {
            System.out.println("At least one of those numbers is 0 and 50 = true");
        }else if(num3 == 0 || num3 == 50) {
            System.out.println("At least one of those numbers is 0 and 50 = true");
        }else if(num4 == 0 || num4 == 50) {
            System.out.println("At least one of those numbers is 0 and 50 = true");
        }else if(num5 == 0 || num5 == 50) {
            System.out.println("At least one of those numbers is 0 and 50 = true");
        }else if(num6 == 0 || num6 == 50) {
            System.out.println("At least one of those numbers is 0 and 50 = true");
        }else if(num7 == 0 || num7 == 50) {
            System.out.println("At least one of those numbers is 0 and 50 = true");
        }else{
            System.out.println("At least one of those numbers is 0 and 50 = false");
        }

        if(num1 >= 40 && num1 <=50){
            System.out.println("There is no number between 40 and 50 = false");
        }else if(num2 >= 40 && num2 <=50) {
            System.out.println("There is no number between 40 and 50 = false");
        }else if(num3 >= 40 && num3 <=50) {
            System.out.println("There is no number between 40 and 50 = false");
        }else if(num4 >= 40 && num4 <=50) {
            System.out.println("There is no number between 40 and 50 = false");
        }else if(num5 >= 40 && num5 <=50) {
            System.out.println("There is no number between 40 and 50 = false");
        }else if(num6 >= 40 && num6 <=50) {
            System.out.println("There is no number between 40 and 50 = false");
        }else if(num7 >= 40 && num7 <=50) {
            System.out.println("There is no number between 40 and 50 = false");
        }else{
            System.out.println("There is no number between 40 and 50 = true");
        }



        System.out.println("\nTask 4\n");

        int ran1 = (int) (Math.random() * 101);
        int ran2 = (int) (Math.random() * 101);
        int ran3 = (int) (Math.random() * 101);

        System.out.println(ran1);
        System.out.println(ran2);
        System.out.println(ran3);

        if(ran1 > 25 && ran2 > 25 && ran3 > 25){
            System.out.println("All numbers are greater than 25 = true");
        }else{
            System.out.println("All numbers are greater than 25 = false");
        }

        System.out.println("\nTask 5\n");
        System.out.println("Enter a number between 1 and 7. (1 and 7 included)");

        int input = userInput.nextInt();

        if(input == 1){
            System.out.println("The number entered returns MONDAY");
        }else if(input == 2) {
            System.out.println("The number entered returns TUESDAY");
        }else if(input == 3) {
            System.out.println("The number entered returns WEDNESDAY");
        }else if(input == 4) {
            System.out.println("The number entered returns THURSDAY");
        }else if(input == 5) {
            System.out.println("The number entered returns FRIDAY");
        }else if(input == 6) {
            System.out.println("The number entered returns SATURDAY");
        }else if(input == 7) {
            System.out.println("The number entered returns SUNDAY");
        }else{
            System.out.println("The number entered returns nothing. Enter the correct number please.");
        }

        System.out.println("\nTask 6\n");

        System.out.println("Enter a number between -10 and 10. (-10 and 10 are included)");

        int input1 = userInput.nextInt();

        if(input1 > 0){
            System.out.println("Number entered is POSITIVE");
            if (input1 % 2 == 0){
                System.out.println("Number entered is EVEN");
            }else{
                System.out.println("Number entered is ODD");
            }
        }else if(input1 < 0){
            System.out.println("Number entered is NEGATIVE");
            if (input1 % 2 == 0){
                System.out.println("Number entered is EVEN");
            }else{
                System.out.println("Number entered is ODD");
            }
        }else {
            System.out.println("Number entered is ZERO");
            System.out.println("Number entered is EVEN");
        }


        System.out.println("\nTask 7\n");
        System.out.println("Tell me your exam results?");

        int mathScore1 = userInput.nextInt(), mathScore2 = userInput.nextInt(), mathScore3 = userInput.nextInt();

        int avgScore = (mathScore1 + mathScore2 + mathScore3) / 3;

        if(avgScore >= 70){
            System.out.println("YOU PASS!");
        }else{
            System.out.println("YOU FAILED!");
        }



        System.out.println("\nTask 8\n");

        System.out.println("Enter 3 numbers");

        int user1 = userInput.nextInt(), user2 = userInput.nextInt(), user3 = userInput.nextInt();

        if(user1 == user2 && user2 == user3){
            System.out.println("TRIPLE MATCH");
        }else if(user1 == user2 || user2 ==user3 || user1 == user3){
            System.out.println("DOUBLE MATCH");
        }else{
            System.out.println("NO MATCH");
        }

    }
}
