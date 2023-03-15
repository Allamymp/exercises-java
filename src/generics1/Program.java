package generics1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintService<Integer> psInteger = new PrintService<>();

        System.out.println("How many values?");
        int howManyValues = sc.nextInt();

        for(int i = 0; i<howManyValues; i++){
            System.out.println("Input value: ");
            psInteger.addValue(sc.nextInt());
        }

        psInteger.print();
        System.out.println("First: "+psInteger.first());


        PrintService<String> psString = new PrintService<>();

        System.out.println("How many values?");
        howManyValues = sc.nextInt();

        for(int i = 0; i<howManyValues; i++){
            System.out.println("Input value: ");
            psString.addValue(sc.next());
        }

        psString.print();
        System.out.println("First: "+ psString.first());

        sc.close();
    }
}