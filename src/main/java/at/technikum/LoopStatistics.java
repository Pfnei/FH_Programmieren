package at.technikum;

import java.util.Scanner;

public class LoopStatistics {

    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        int number;
        int count = 0;
        double sum = 0;
        int max = 0; // only positiv numbers can bei entered, requiered for first iteration of loop;
        int min = Integer.MAX_VALUE; // o requiered for first iteration of loop;

        // System.out.prinln("enter pos. numbers:");

        while (true) {
            number = sc.nextInt();
            // loop shall terminate in case number not positve
            if (0 >=number) {
                if (0!=count) {
                    System.out.printf("numbers entered: %d\n", count);
                    System.out.printf("minimum: %d\n", min);
                    System.out.printf("maximum: %d\n", max);
                    System.out.printf("mean: %.2f\n", sum / count);
                    break;
                }
                // no positive number ist entered at all
                else {
                    System.out.println("no positive number entered");
                    break;
                }

            }
            sum +=number;
            min= Math.min (min, number);
            max= Math.max (max, number);
            count++;
        }


        sc.close();
    }



}
