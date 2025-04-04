package at.technikum;

import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class ArrayEvenStatistic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int SIZE = 1024;

        int[] number = new int[SIZE];
        int[] even = new int[SIZE];
        System.out.println("Input - nur int");
        int input;
        int evenPosition = 0;
        int evenLenght;
        int numberLenght;
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
                }
            } else {
                evenLenght = evenPosition;
                break;

            }


            // Output
            System.out.println("Input finshed");
            System.out.printf("             count: %d\n", evenPosition);
            if (number.length != 0 && evenPosition != 0) {
                System.out.printf("      index position:");
                printArrayPos(even);
                System.out.println();
                System.out.printf("               sum: %d\n", arraySum(even));
                System.out.printf("               mean: %d\n", (arraySum(even) / even.length);
                System.out.printf("      index position:");
                printArrayPos(storeMaxPos(even, maxEven, SIZE));
                System.out.println();
            }
            if (number.length == 0) System.out.println("no numbers entered");

            sc.close();
        }
    }
        private static boolean checkAbbruch ( int value,  Scanner scan){
            System.out.println("re-enter 0 to store the value.");
            System.out.println("any other value ends input.");
            value = scan.nextInt();
            if (value != 0) {
                System.out.println("Input finished.");
                return true;
            }
            return false;
        }

        private static int maximum ( int a, int b){
            if (a >= b) return a;
            return b;
        }

        private static int arraySum ( int[] arr){
            int sum = 0;
            for (int pos : arr) {
                sum += pos;
            }
            return sum;
        }
        private static void printArrayPos ( int[] arr){
            System.out.print("[");
            for (int pos : arr) {
                System.out.printf(" %d", pos);
            }
        }

        private static int[] storeMaxPos ( int[] arr, int max, int size){
            int[] evenPos = new int[size];
            int j = 0;
            for (int i = 0; i <= arr.length; i++) {
                if (arr[i] == max) {
                    evenPos[j] = i;
                    j++;
                }
            }
            return evenPos;
        }
    }

