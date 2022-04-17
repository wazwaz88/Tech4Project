package operator.arithmeticOperators;

public class Exercise3 {
    public static void main(String[] args) {

        double salary = 90_000.00;
        int months = 12;
        int biweeks = 26;
        int weeks = 52;

        double monthlySalary = salary / months;
        double biweeklySalary = salary / biweeks;
        double weeklySalary = salary / weeks;

        System.out.println("Monthly Salary = " + monthlySalary);
        System.out.println("Biweekly Salary = " + biweeklySalary);
        System.out.println("Weekly Salary = " + weeklySalary);


    }
}
