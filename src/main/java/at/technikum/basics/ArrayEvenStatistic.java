package at.technikum;

import java.util.Scanner;

public class ArrayEvenStatistic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int SIZE = 1024;

        int[] number = new int[SIZE];
        int[] even = new int[SIZE];
        System.out.println("Input - nur int");
        int input;
        int evenPosition = 0;
        int evenLenght = 0;
        int numberLenght = 0;
        int sumEven = 0;
        int maxEven = Integer.MIN_VALUE;
        boolean abbruch = false;
        // Input
        for (int i = 0; i <= number.length; i++) {
            System.out.print(":");
            input = sc.nextInt();
            // check if zero to be stored
            if (input == 0) {
                abbruch = checkAbbruch(input, sc);
            }
            if (!abbruch) {
                number[i] = input;
                if (input % 2 == 0) {
                    even[evenPosition] = i;
                    evenPosition++;
                    maxEven = maximum(maxEven, input);
                    sumEven += number[i];
                }
            } else {
                evenLenght = evenPosition;
                numberLenght = i + 1;
                break;

            }
            numberLenght = i + 1;
        }
        // Output
        System.out.printf("             count: %d\n", evenPosition);
        if (numberLenght != 0 && evenLenght != 0) {
            System.out.printf("      index position:");
            printArrayPos(even, evenLenght);
            System.out.println();
            System.out.printf("               sum: %d\n", sumEven);
            System.out.printf("               mean: %.2f\n", (sumEven + 0.0f) / evenLenght);
            System.out.printf("               max: %d ", maxEven);
            storeAndPrintMaxPos(number, maxEven, numberLenght);
            System.out.println();
        }
        if (numberLenght == 0) System.out.println("no numbers entered");

        sc.close();
    }

    private static boolean checkAbbruch(int value, Scanner scan) {
        System.out.println("re-enter 0 to store the value.");
        System.out.println("any other value ends input.");
        value = scan.nextInt();
        if (value != 0) {
            System.out.println("Input finished.");
            return true;
        }
        return false;
    }

    private static int maximum(int a, int b) {
        if (a >= b) return a;
        return b;
    }

    private static void printArrayPos(int[] arr, int lanege) {
        System.out.print("[");
        for (int i = 0; i < lanege; i++) {
            System.out.printf(" %d", arr[i]);
        }
        System.out.print("]");
    }

    private static void storeAndPrintMaxPos(int[] arr, int max, int size) {
        int[] evenPos = new int[size];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == max) {
                evenPos[j] = i;
                j++;
            }
        }
        printArrayPos(evenPos, j);
    }
}

