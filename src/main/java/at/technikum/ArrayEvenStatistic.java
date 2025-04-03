package at.technikum;

import java.util.Scanner;

public class ArrayEvenStatistic {
   public static void main (String [] args) {
       Scanner sc = new Scanner(System.in);
       final int SIZE = 1024;

       int[] number = new int[SIZE];
       int[] even = new int[SIZE];
       System.out.println("Input - nur int");
       int input;
       int evenPosition = 0;
       int sumEven = 0;
       int maxEven = Integer.MIN_VALUE;
       boolean abbruch = false;
       // Input
       for (int i = 0; i <= number.length; i++){
           System.out.println(":");
           input = sc.nextInt();
           // check if zero to be stored
           if (input == 0) {
               abbruch = checkAbbruch(input, sc);
           }
           if (!abbruch) {
               number[i] = input;
               if (input%2==0){
                 even [evenPosition] = i;
                 evenPosition ++;
                 maxEven = maximum(maxEven, input);
               }
           }

       }

       // Output
       System.out.println("Input finshed");
       System.out.printf("             count: %d\n", number.length);
       if (number.length == 0) ;

       sc.close();
   }

    private static boolean checkAbbruch (int value, Scanner scan)
   {
            System.out.println("re-enter 0 to store the value.");
            System.out.println("any other value ends input.");
            value = scan.nextInt();
            if (value != 0) {
                System.out.println("Input finished.");
                return true;
            }
            return false;
    }

    private static int maximum (int a, int b) {
        if (a >= b) return a;
        return b;
    }

    private static int arraySum (int [] arr ) {

    }

}





