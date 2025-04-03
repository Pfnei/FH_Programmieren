package at.technikum;
import java.util.Scanner;

public class EANCheck {

    public static void main(String[] args) {

        int hunderter = 1;
        int gerade=0 , sumGerade = 0;
        int ungerade=0 , sum = 0;
        int checkNumber;

        Scanner sc = new Scanner(System.in);
        System.out.print("EAN Code 13-Stellen : ");

        long EANCode = sc.nextLong();
        long workEAN = EANCode/10; // Last digit is checksum

        //System.out.println(EANCode);
        for (int i=1; i<13;i+=2){
           // System.out.println(workEAN / hunderter);
            gerade= gerade + (int) ((workEAN / (hunderter*10)) % 10);
            ungerade= ungerade+(int) ((workEAN / (hunderter)) % 10);
            if ((workEAN / hunderter) < 100) { i=13;};
            hunderter = hunderter*100;
           // System.out.println(ungerade +"/" + gerade);
        // insgesamt ein bisserl kompliziert - es geht einfacher - EAN immer um eine Stelle vekleinern und je nachdem ob die Schleife gerade oder ungerade ist, die Summe erhöhen
        // es funktioniert aber gut
        }

       sc.close();

        checkNumber= gerade*3+ungerade;
        //System.out.println(checkNumber);
        checkNumber-=1;
        //System.out.println(checkNumber);
        checkNumber = 9- (checkNumber  % 10);
        //System.out.println(checkNumber);

        if (checkNumber == EANCode%10 )
        {
            System.out.println("The EAN is valid");
        }
        else
        {
            System.out.println("The EAN is NOT valid");
        }


    }

}
