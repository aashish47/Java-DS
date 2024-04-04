package CodingNinjas.Assignment4;

import java.util.Scanner;

/**
 * Created by Hp on 6/15/2017.
 */
public class Equilibrium {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i, j, sumLower, sumHigher;
        System.out.println("Enter size");
        int size = s.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements");
        for (i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        sumHigher = arr[arr.length - 1];
        sumLower = arr[0];
        for (i = 0, j = arr.length - 1; i < j && j > i; ) {
            if (sumLower == sumHigher) {
                if (j == (i + 2)) {
                    System.out.println("Equilibrium found at index " + (i + 1));
                    System.exit(0);
                }
                if (j == (i + 1)) {
                    System.out.println("Equilibrium not found");
                    System.exit(0);
                }
                if (i >= j) {
                    System.out.println("Equilibrium not found");
                    System.exit(0);
                }
                sumLower += arr[i];
                sumHigher += arr[j];
                i++;
                j--;
            }
            if (sumLower < sumHigher) {
                while (sumLower < sumHigher && i < j) {
                    sumLower += arr[++i];
                }
                if (i >= j) {
                    System.out.println("Equilibrium not found");
                    System.exit(0);
                }
                if (sumLower == sumHigher) {
                    if (j == (i + 2)) {
                        System.out.println("Equilibrium found at index " + (i + 1));
                        System.exit(0);
                    }
                    if (j == (i + 1)) {
                        System.out.println("Equilibrium not found");
                        System.exit(0);
                    }
                    j--;
                    sumHigher += arr[j];
                }
            }
            if (sumHigher < sumLower) {
                while (sumHigher < sumLower && j > i) {
                    sumHigher += arr[--j];
                }
                if (i >= j) {
                    System.out.println("Equilibrium not found");
                    System.exit(0);
                }
                if (sumLower == sumHigher) {
                    if (j == (i + 2)) {
                        System.out.println("Equilibrium found at index " + (i + 1));
                        System.exit(0);
                    }
                    if (j == (i + 1)) {
                        System.out.println("Equilibrium not found");
                        System.exit(0);
                    }
                    i++;
                    sumLower += arr[i];
                }
            }

        }

    }
;}

