package loops.whileLoop;

public class PrintNumbersDividedBy3 {
    public static void main(String[] args) {

        int i = 1;


        String s = "";

        while(i <= 30){
            if(i % 3 == 0) {
                s += i + " ";
            }
            i++;
        }


        System.out.println(s.substring(0, s.length() - 1));





    }
}
