package CodingNinjas.Assignment3;

import java.util.Scanner;

/**
 * Created by Hp on 6/14/2017.
 */
public class Ques6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = s.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements (from 0 to " + (size - 2) + " every element should be present)");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length;j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate element is " + arr[i]);
                    System.exit(0);
                }
            }
        }

    }
}