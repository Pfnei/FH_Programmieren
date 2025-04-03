package at.technikum;

import java.util.Scanner;

public class PosNumbers {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int zaehler = 0;
        int sum = 0;
        while (true) {
            zaehler ++;
            System.out.print("Enter a positve Number: ");
            int number = sc.nextInt();
            if (0 >= number) {
                zaehler--;
                //System.out.println("Not a positive number");
                System.out.printf("Die Schleife wurde %d Mal durchlaufen.\n", zaehler );
                System.out.printf("Die Summe der Zahlen ist: %d", sum );
                break;
            }
            sum += number;
        }
        sc.close();
    }


}
