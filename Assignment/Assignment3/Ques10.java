package CodingNinjas.Assignment3;

import java.util.Scanner;

/**
 * Created by Hp on 6/14/2017.
 */
public class Ques10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = s.nextInt();
        int temp;
        int arr[] = new int[size];
        System.out.println("Enter array elements ");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0 ; j < arr.length - 1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}