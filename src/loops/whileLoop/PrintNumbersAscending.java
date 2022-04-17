package loops.whileLoop;

public class PrintNumbersAscending {
    public static void main(String[] args) {



        int i = 1;
        String order = "";
        while(i <= 7){

            System.out.println(i);
            i++; // if this is not here, it will be infinite loop
        }


        String s = "";

            for (int j = 1; j <= 7; j++) {
                s += j + "-";
            }

        System.out.println(s.substring(0, s.length() - 1));










    }
}
