package at.technikum;

import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print ("Enter a number:");
        float summe = sc.nextFloat();
        System.out.printf ("With tax: %.1f", summe*1.2);

    }
}
