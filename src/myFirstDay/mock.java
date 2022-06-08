package myFirstDay;

import java.util.HashMap;
import java.util.Map;

public class mock {

    /*
    Requirement:
-Student is responsible to create a main method and test their method.
-Write a method that takes an array of String and returns the count of each unique element in the array as a Map
Test Data:
[“Apple”, “Apple”, “Orange”, “Apple”, “Kiwi”]
Expected:
 {Apple=3, Orange=1, Kiwi=1}
     */

    public static Map<String, Integer> returnAMap(String[] array){
        HashMap<String, Integer> elements = new HashMap<>();

        for(String e: array){
            if (elements.containsKey(e)) elements.put(e, elements.get(e) + 1);
            else elements.put(e, 1);
        }

        return elements;
    }

    public static void main(String[] args) {

        String[] array = {"Apple", "Apple", "Orange", "Apple", "Kiwi"};

        System.out.println(returnAMap(array));

    }




}
