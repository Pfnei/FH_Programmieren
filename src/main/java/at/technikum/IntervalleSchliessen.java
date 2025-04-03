package at.technikum;

import java.util.Scanner;


public class IntervalleSchliessen {
    public static void main (String [] args) {
       int a,b,c,d;
           Scanner sc = new Scanner(System.in);

       System.out.print ("Grenze1:");
       a = sc.nextInt();
       System.out.print ("Grenze2:");
       b = sc.nextInt();
        System.out.print ("Grenze1:");
        c = sc.nextInt();
        System.out.print ("Grenze2:");
        d = sc.nextInt();
        System.out.printf ("Intervall 1: [%d,%d]\n", Math.min(a,b), Math.max(a,b));
        System.out.printf ("Intervall 2: [%d,%d]\n", Math.min(c,d), Math.max(c,d));
        System.out.printf ("geschlossenes Intervall: [%d,%d]\n", Math.min(Math.min(a,b),Math.min(c,d)) , Math.max(Math.max(a,b),Math.max(c,d)));

    }


}
