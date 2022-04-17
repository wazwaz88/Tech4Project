package arrays;

public class ForEachLoop {
    public static void main(String[] args) {


        char[] chars = {'a', ' ', ',', '#', 'T', '6', '9'};


        System.out.println(chars.length); // 7


        for (int i = 0; i < chars.length; i++) {
            System.out.println("Element " + (i+1) + " = " + chars[i]);
        }


        for (char element: chars) {
            System.out.println(element);
        }









    }
}
