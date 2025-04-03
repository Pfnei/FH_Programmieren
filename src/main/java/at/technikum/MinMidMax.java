package at.technikum;

import java.util.Scanner;

public class MinMidMax {
    public static void main (String [] args){
        int a,b,c;
        String seperator1 = "<";
        String seperator2 = "<";

        Scanner sc = new Scanner(System.in);

        System.out.print ("a:");
        a = sc.nextInt();
        System.out.print ("b:");
        b = sc.nextInt();
        System.out.print ("c:");
        c = sc.nextInt();

        if (a<=b) {
            if (b<=c) {
                if (a==b) {seperator1 = "=";}
                if (b==c) {seperator2 = "=";}
                System.out.println (a+seperator1+b+seperator2+c);
                System.out.println ("a"+seperator1+"b"+seperator2+"c");
                return;
            }
        }

        if (c<=b) {
            if (b<=a) {
                if (c==b) {seperator1 = "=";}
                if (b==a) {seperator2 = "=";}
                System.out.println (c+seperator1+b+seperator2+a);
                System.out.println ("c"+seperator1+"b"+seperator2+"a");
                return;
            }
        }

        if (c<=a) {
            if (a<=b) {
                if (c==a) {seperator1 = "=";}
                if (b==a) {seperator2 = "=";}
                System.out.println (c+seperator1+a+seperator2+b);
                System.out.println ("c"+seperator1+"a"+seperator2+"b");
                return;
            }
        }

        if (a<=c) {
            if (c<=b) {
                if (a==c) {seperator1 = "=";}
                if (b==c) {seperator2 = "=";}
                System.out.println (a+seperator1+c+seperator2+b);
                System.out.println ("a"+seperator1+"c"+seperator2+"b");
                return;
            }
        }

        if (b<=a) {
            if (a<=c) {
                if (a==b) {seperator1 = "=";}
                if (a==c) {seperator2 = "=";}
                System.out.println (b+seperator1+a+seperator2+c);
                System.out.println ("b"+seperator1+"a"+seperator2+"c");
                return;
            }
        }

        if (b<=c) {
            if (c<=a) {
                if (c==b) {seperator1 = "=";}
                if (a==c) {seperator2 = "=";}
                System.out.println (b+seperator1+c+seperator2+a);
                System.out.println ("b"+seperator1+"c"+seperator2+"a");
                return;
            }
        }

    }


}
