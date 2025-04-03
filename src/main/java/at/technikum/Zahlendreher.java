package at.technikum;
import java.util.Scanner;
public class Zahlendreher {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int zahl = sc.nextInt();
        int einer = zahl /100;
        int zehner = zahl /10 % 10;
        int hundert = zahl % 100 % 10;
        System.out.printf("Ausgabe: %d%d%d", hundert, zehner, einer);



    }
}
