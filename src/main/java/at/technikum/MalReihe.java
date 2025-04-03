package at.technikum;

import java.util.Scanner;

public class MalReihe {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int fix, grenz;


      while (true) {
            System.out.print("Fixfaktor: ");
            fix = sc.nextInt();
            if (-10 <= fix && 10>= fix) break;

      }

        while (true) {
            System.out.print("Grenzfaktor: ");
            grenz = sc.nextInt();
            if (1 <= grenz && 10>= grenz) break;

        }

        for (int i = 1; i<=grenz; i++) System.out.printf("%2d x  %d = %3d\n", i, fix, i*fix);



    }



}
