package wildCardTypes.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        // List<Object> myObj = new ArrayList<Object>();
        List<Integer> myNumbers = Arrays.asList(5, 2, 10);
        List<String> myString = Arrays.asList("avocado", "Yogurt", "football");
        // myObj = myNumbers; // Integer is subtype de Object, but, List<Object> cant be supertype of List<Integer>
        printList(myNumbers);
        System.out.println();
        printList(myString);

        // Object obj;
        //Integer x = 10;
        //obj = x; // that can be maded because Integer is a wrapper subtype of Object.

    }

    //this method receive a wildCard type List(? in signature method) and return a print of objects
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
    }

}
