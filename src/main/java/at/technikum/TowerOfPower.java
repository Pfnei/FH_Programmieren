package at.technikum;

import java.util.Scanner;

public class TowerOfPower {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print (" enter base: ");
            int base = sc.nextInt();
            int basis = base;
            for (int i = 1; i<=7; i++) {
                System.out.printf("%8d\n",base);
                base=base*basis;
            }

        }

    }