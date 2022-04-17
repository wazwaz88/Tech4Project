package stringMethods;

import utilities.ScannerHelper;

public class PracticeComparison {
    public static void main(String[] args) {

        String str1 = ScannerHelper.getStringFromUser();
        String str2 = ScannerHelper.getStringFromUser();


        if(str1.equals(str2)) System.out.println("These strings are equal");
        else System.out.println("These strings are not equal");



    }
}
