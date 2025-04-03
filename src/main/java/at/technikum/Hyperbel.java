package at.technikum;
import java.util.Scanner;
public class Hyperbel {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("zahl: ");
        int a = sc.nextInt();
        System.out.print("zahl: ");
        int b = sc.nextInt();
        System.out.print("zahl: ");
        int c = sc.nextInt();
        System.out.print("zahl: ");
        int d = sc.nextInt();
        System.out.print("zahl: ");
        double e = sc.nextDouble();
        System.out.println ("01234567890123456");
        System.out.printf ("\\%17s","/\n");
        System.out.printf ("%2s %011d %-2s\n","\\",a,"/");
        System.out.printf ("%3s%11s%-3s\n","\\","","/");
        System.out.printf ("%-3d| %03.3f |%-3d\n",b,e,c);
        System.out.printf ("%3s%11s%-3s\n","/","","\\");
        System.out.printf ("%2s %011d %-2s\n","/",d,"\\");
        System.out.printf ("/%16s","\\\n");
    }
}
