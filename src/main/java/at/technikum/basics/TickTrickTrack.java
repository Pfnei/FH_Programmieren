package at.technikum;

import java.util.Scanner;

public class TickTrickTrack {
    public static void main (String [] args) {
        int counter = 0, current, old=0, countequal=1;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("Eingabe:");
            current = sc.nextInt();
            //counter++;
            if (counter++ == 0) {old = current;continue;}
            if (current == old) {
                countequal++;
                if (3==countequal) { System.out.printf("Ende (%d Eingaben)", counter); break;}
                System.out.println("Track:");
            }
            if (current < old) {
                System.out.println("Tick:");
                countequal =1;
                            }
            if (current > old) {
                System.out.println("Trick:");
                countequal =1;
            }
            old = current;
        }


    }


}
