package at.technikum;
import java.util.Scanner;
public class TimeCalculator {
    public static void main (String [] arg) {
        Scanner sc = new Scanner (System.in);
        System.out.print ("millseconds: ");
        long milli = sc.nextLong();
        long days = (milli/1000) / (3600*24);
        long hours = (milli/1000) % (3600*24) / 3600;
        long minutes = milli / (1000*60) % 60;
        long seconds = milli / 1000 % 60;
        long ms = milli % 1000;
        System.out.printf ("%-9s %d\n", "days", days);
        System.out.printf ("%-9s %d\n", "hours", hours);
        System.out.printf ("%-9s %d\n", "minutes", minutes);
        System.out.printf ("%-9s %d\n", "seconds", seconds);

        System.out.printf ("%-9s %d\n", "ms", ms);
    }
}
