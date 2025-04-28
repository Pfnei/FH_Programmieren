package at.technikum;


import java.util.Scanner;

public class Oktal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Oktalzahl einegeben: ");
        int oktalzahl = sc.nextInt();
        int einer = oktalzahl % 10;
        int achter = oktalzahl / 10 % 10;
        int viersechzig = oktalzahl / 100;
        int dezimal = einer * 1 + achter * 8 + viersechzig * 64;
        System.out.printf("dezimal: %d\n", dezimal);
        einer = dezimal % 10;
        achter = dezimal / 10 % 10;
        viersechzig = dezimal / 100;
        System.out.printf("Quersumme: %d", einer + achter + viersechzig);
    }
}
