package at.technikum;

import java.util.Scanner;

public class Notenstatistik {

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int grade, negResult=0, count = 0;
        double sum=0;

        System.out.println("Noteneingane:");

        while (true){
            System.out.print(":");
            grade = sc.nextInt();
            if (grade == 0) break;
            if (1<=grade && 5>=grade){sum+=grade; count++; }
            if (grade == 0) negResult++;
            if (0>grade || 5<grade) System.out.println("Falsche Eingabe:" );
        }
        System.out.printf("Notendurchschnitt: %.2f  Anzahl Feunfer: %d", sum/count, negResult );

     sc.close();
    }
}
