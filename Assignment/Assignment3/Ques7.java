package CodingNinjas.Assignment3;

import java.util.Scanner;

/**
 * Created by Hp on 6/14/2017.
 */
public class Ques7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = s.nextInt();
        int arr[] = new int[size];
        int flag=1 ;
        System.out.println("Enter array elements");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size; j++) {
                if(i==j){
                    continue;
                }
                if (arr[i] == arr[j]) {
                    flag = 0;
                    break;
                }
                else {
                    flag = 1;
                }
            }
            if(flag==1) {
                System.out.println("non repeating element " + arr[i]);
                System.exit(0);
            }
        }
        if(flag==0) {
            System.out.println("No non repeating element");
        }
    }
}