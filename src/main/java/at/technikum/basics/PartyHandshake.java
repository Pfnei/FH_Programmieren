package at.technikum;

import java.util.Scanner;


public class PartyHandshake {

    static Scanner sc;

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        System.out.printf("Anzahl Personen: ");
        int n = sc.nextInt();
        String[] names = readNames(n);
        String[] handshakes = handShakes(names);
        print(handshakes);
        sc.close();
    }

    public static String[] readNames(int n) {
        String[] temp = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Name: ");
            temp[i] = sc.next();
        }
        return temp;
    }

    public static String[] handShakes(String[] names) {
        // Gausches Formel Summe 1 bis N = N*(N+1)/2
        // wir starten bei n-1 --> Summe der Handschakes (N-1)*N/2
        int Anzahl = names.length;
        String[] temp = new String[Anzahl * (Anzahl - 1) / 2];
        int count = 0;
        for (int start = 0; start < (Anzahl - 1); start++) {
            // Start ghet nur bis zum vorletzten Element
            for (int i = start + 1; i < Anzahl; i++) {
                temp[count] = names[start] + " -> " + names[i];
                count++;
            }

        }
        return temp;
    }
    public static void print(String[] stra){
        for (int i = 0 ; i < stra.length; i++) {
            System.out.println(stra[i]);
        }
    }


}







