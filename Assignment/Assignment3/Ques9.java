package CodingNinjas.Assignment3;

import java.util.Scanner;

/**
 * Created by Hp on 6/14/2017.
 */
public class Ques9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = s.nextInt();
        int temp;
        int arr[] = new int[size];
        System.out.println("Enter array elements (0 or 1)");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int j = i + 1;
            if (arr[i] == arr[j]) {
                if (arr[i] == 0) {
                    continue;
                }
                else {
                    while (arr[i] == arr[j] && j < arr.length-1 ) {
                        j++;
                    }

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            else {

                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
