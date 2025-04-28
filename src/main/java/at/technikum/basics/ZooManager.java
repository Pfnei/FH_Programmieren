package at.technikum;

import java.util.Scanner;

public class ZooManager {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        float [] gewicht = new float [8];
        float [] groesse = new float [8];
        read (gewicht);
        read (groesse);
        print (gewicht);
        print (groesse);
        System.out.println(b_of_max_a (gewicht, groesse));
        read (groesse);
        print (gewicht);
        print (groesse);
        System.out.println (avg (gewicht));
        System.out.println( b_of_max_a (gewicht, groesse));
        clear(gewicht);
        clear (groesse);
        print (gewicht);
        print (groesse);
    }


    public static void read(float values[]) {

        int start = values.length - 1; // wenn alle Werte befüllt sind ist der fiktive Startwert die Arraylänge
        for (int i = 0; i < values.length; i++) {
            if (values[i] == 0) {
                start = i;
                break;
            } // man braucht nich auf null prüfen, weil der der primitive Datentyp standardmäßig 0.0f ist
        }
        if (start == values.length - 1) {
            System.out.printf("Keine weiteren Eingaben mehr möglich. Es wurden bereits %d Werte gespeichert.\n", values.length);
            return;
        }

        for (int i = start; i < values.length; i++) {
            System.out.print("Eingabe:");
            values[i] = sc.nextFloat();
            if (values[i] < 0) values[i] = 0;
            if (values[i] == 0) break;
        }

    }

    public static void print(float values[]) {
        System.out.print("{ ");
        for (int i = 0; i < values.length; i++) {
            if (values[i] == 0) break;
            System.out.printf("%.2f ", values[i]);
        }
        System.out.print(" }");
    }

    public static int count(float values[]) {
        int count = 0;
        for (int i = 0; i < values.length; i++) {
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
        int count = 0;
        float sum = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == 0) break;
            sum += values[i];
            count++;
        }
        if (sum == 0) return 0.0f;
        return sum / count;
    }

    public static float b_of_max_a(float a[], float b[]) {
        if (a[0] == 0 || b[0] == 0) return -1.0f;
        float max = 0;
        int maxPos = 0;
        for (int i = 0; i < a.length; i++) {

            if (a[i] == 0) {
                // Ausscheiden der Fälle wo a und b nicht gleich viele Werte haben
                // Fall 1 - bis kürzer als a
                if (b[i-1] ==0) return -1.0f;
                if (b[i] == 0)
                     return b[maxPos];
                else
                    // Fall 2 a kürzer als b
                    return -1.0f;
            }
            if (a[i] > max) {
                max = a[i];
                maxPos = i;
            }

        }
        return -1.0f;

    }

}


