package at.technikum;

import java.util.Scanner;

public class DateFormatConverter {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Gib ein Datum ein (yyyymmdd): ");
            int datenstring= sc.nextInt(); //read an integer value
            int day=0, month=0, year=0;
            year = datenstring/10000;
            month = datenstring%10000/100;
            day = datenstring%100;
            System.out.printf("%02d.%02d.%d" , day, month, year); //print it again

            sc.close();
        }
    }
