package at.technikum;

import java.util.Scanner;

public class Walker {
    public static void main (String [] args){
        int eingabe, posx=1, posy=10, counter=0;
        //x horizontal
        // y vertikal
        final int uBOUNDARY = 10;
        final int lBOUNDARY = 1;
        Scanner sc = new Scanner(System.in);
        while (true){
            for (int y = 1; y<=10;y++) {
                for (int x = 1; x <= 10; x++) {
                    if (posx == x && posy == y) {System.out.print('X'); continue;}
                    System.out.print('.');
                }
                System.out.println();
            }

            boolean currectInput;
            while (true) {
                System.out.print("\nEingabe: ");
                eingabe = sc.nextInt();

                switch (eingabe){
                    case 8,6,2,4: counter++; break;
                    case 5: break;
                    default: System.out.println("Ungültige Eingabe!");
                }

                if (eingabe==8) {
                    if  ((posy-1)>=lBOUNDARY) {posy--; break;}
                    else System.out.println("Out of boundary");}

                if (eingabe==6) {
                    if ((posx+1)<=uBOUNDARY) {posx++; break;}
                    else System.out.println("Out of boundary");}

                if (eingabe==2) {
                    if ((posy+1)<=uBOUNDARY) {posy++; break;}
                    else System.out.println("Out of boundary");}

                if (eingabe==4) {
                    if ((posx-1)>=lBOUNDARY)  {posx--;break;}
                    else System.out.println("Out of boundary");}

                if (eingabe==5) {System.out.printf("Ende - Schritte insgesamt: %d", counter); return;}


            }

        }







    }


}
