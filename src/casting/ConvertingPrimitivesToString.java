package casting;

public class ConvertingPrimitivesToString {
    public static void main(String[] args) {

        int num = 36;

        // + (concatenation)
        // valueOf() method

        String numStr1 = "" + 45 + num + ""; // if quotations is at the end, it adds them.
        // if quotations is at the beginning it will concatenate them
        String numStr2 = String.valueOf(num + 45);

        System.out.println(numStr1);
        System.out.println(numStr2);






    }
}