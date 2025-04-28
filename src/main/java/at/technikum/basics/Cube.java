package at.technikum;

import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Gib die Seitenlänge eines Würfels ein : ");
        int side = sc.nextInt(); //read an integer value
        System.out.printf("Oberfläche = %d\n", side*side*6); //print it again
        System.out.printf("Volumen = %d\n", side*side*side); //print it again
        sc.close();
    }
}
