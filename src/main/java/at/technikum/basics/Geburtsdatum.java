package at.technikum;

import java.util.Scanner;

public class Geburtsdatum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Gib dein Geburtsdatum ein (TTMMJJ): ");
        int geboren = sc.nextInt();
       int jahr, monat, tag;
       tag = geboren /10000;
       jahr = geboren % 100;
       monat = (geboren % 10000) / 100;
       System.out.printf("\n Dein Geburtstag ist (JJMMTT): %02d%02d%02d", jahr,monat,tag );
    }
}
