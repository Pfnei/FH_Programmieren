package at.technikum;

import java.util.Scanner;

public class ZooManager {
    public static void main (String [] args) {
    }





    public static void read(float values[]) {
        Scanner sc = new Scanner(System.in);
        int start = values.length-1; // wenn alle Werte befüllt sind ist der fiktive Startwert die Arraylänge
        for (int i = 0; i<values.length;i++){
            if (values[i] ==0) {start = i; break;} // man braucht nich auf null prüfen, weil der der primitive Datentyp standardmäßig 0.0f ist
        }
        if (start == values.length-1) {System.out.printf("Keine weiteren Eingaben mehr möglich. Es wurden bereits %d Werte gespeichert.\n", values.length); sc.close(); return;}

            for (int i = start; i<values.length;i++) {
                System.out.print("Eingabe:");
                values[i] = sc.nextFloat();
                if (values[i] < 0) values[i]=0;
                if (values[i] == 0) break;
            }

        sc.close();
    }

    public static void print(float values[]){
        System.out.print("{ ");
        for (int i = 0; i<values.length;i++) {
            if (values[i] == 0) break;
            System.out.printf("%.2f ", values[i]);
        }
        System.out.print(" }");
    }

    public static int count(float values[]){
        int count=0;
        for (int i = 0; i<values.length;i++) {
            if (values[i] == 0) break;
            count++;
        }
        return count;
    }
    public static void clear(float values[]) {
        for (int i = 0; i < values.length; i++) {
            // if (values[i] == 0) break; - kann man machen, wenn man weiß, dass dahinter wirklich keine Werte mehr stehen
            values[i] = 0;
        }
    }

    public static float avg(float values[]) {
        int count=0;
        float sum = 0;
        for (int i = 0; i<values.length;i++) {
            if (values[i] == 0) break;
            sum+= values[i];
            count++;
        }
        if (sum==0) return 0f;
        return sum/count;
    }





    }


