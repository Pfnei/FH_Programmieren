package at.technikum;

import java.util.Scanner;

public class Diagonale {
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);
        int seitenlaenge;
        char sign = '-';

        while(true)
        {
           System.out.print("Seitenlaenge (ungerade Zahl): ");
            seitenlaenge = sc.nextInt();

            // Beenden wenn Seitenlänge ungerade ist
            if (1==seitenlaenge%2 && 0<=seitenlaenge) break;

            System.out.println("Die Seitenlaenge muss ungerade und positiv sein!");

        }

        for (int i = 1; i<=seitenlaenge; i++) {
            for (int j = 1; j<=seitenlaenge; j++){

                if (i==j || j == seitenlaenge-i+1) sign ='*';
                System.out.print(sign);
                sign = '-';
            }
            System.out.println();

        }
        sc.close();
    }

}
