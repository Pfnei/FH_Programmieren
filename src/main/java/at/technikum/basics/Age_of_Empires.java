package at.technikum;
import java.util.Scanner;
public class Age_of_Empires {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("your age: ");
        int alter = sc.nextInt();
        System.out.println("Das ist eine Scheissübung");
        System.out.printf("%%d:  -%d-\n", alter);
        System.out.printf("%%+d:  -%+d-\n", alter);
        System.out.printf("%% d:  -% d-\n", alter);
        System.out.printf("%%5d:  -% 5d-\n", alter);
        System.out.printf("%%05d:  -%05d-\n", alter);
        System.out.printf("%%-5d:  -%-5d37-\n", alter);
        System.out.printf("%%#x:  -0x%x-\n", alter);
    }
}
