package myFirstDay;

import java.security.PublicKey;
import java.util.Arrays;

public class Test {
    /*
    To be able to run some code, I need to call main method first.
    All my code MUST be inside class curly braces (block)
     */

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println();
        System.out.println("My name is Abdullah Wazwaz");

        /*
        println vs print
        println - prints the statement in quotations and moves the cursor to the next line
            (empty print line just gives more space and moves everything down a line)
        print- does not move down a line.
        */

        System.out.print("Tech");
        System.out.print("Global");
        System.out.println();

        /*
        \n moves cursor to a new line
        \t moves the text with a tab
        \" inserts double quotation in the console
        \' inserts single quotation in the console
        \\ inserts a backslash
         */
        System.out.println("Tech\nGlobal");

        System.out.println("Apple\nOrange");

        System.out.println("\tTech\nGlobal");

        System.out.println("\tAbdullah\n\tWazwaz");

        System.out.println("\"TechGlobal\"\n");

        System.out.println("\'TechGlobal\'");

        System.out.println("\\Wazwaz\\");

        // Task

        System.out.println("\t\"Nikola Tesla\" Serbian Cycrillic Pronounced 18 July 1856 - 7 January 1943 was a Serbian-American" +
                "\ninventor, electrical engineer, mechanical engineer, and futurist best known for his contributions" +
                "\nto the design of the modern alternating current (AC) electricity supply system");


    }

}
