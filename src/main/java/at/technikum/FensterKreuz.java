package at.technikum;

import java.util.Scanner;

public class FensterKreuz {

    public static void main (String [] args) {
            Scanner sc = new Scanner(System.in);
            int breite = 0;
            int hoehe = 0;
            int horizontal = 0;
            int vertikal = 0;
            char standard;

            while (breite <= 0) {
                System.out.print("Breite: ");
                breite = sc.nextInt();
            }

            while (hoehe <= 0) {
                System.out.print("Höhe: ");
                hoehe = sc.nextInt();
            }

            while (horizontal <= 0 || horizontal > breite) {
                System.out.print("horizontal: ");
                horizontal = sc.nextInt();
            }

            while (vertikal <= 0 || vertikal > hoehe) {
                System.out.print("horizontal: ");
                vertikal = sc.nextInt();
            }
            sc.close();

            for (int i = 1; i<= hoehe; i++){
                if (i==vertikal) { standard = '-';}
                else { standard = '.';}

                for (int j = 1; j<= breite; j++) {
                    if (j != horizontal) {
                        System.out.print(standard);
                    } else {
                        if (i != vertikal) {
                            System.out.print("|");
                        } else {
                            System.out.print("+");
                        }
                    }
                }
                System.out.print("\n");
            }




    }




}
