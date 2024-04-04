package CodingNinjas.Assignment4;

import java.util.Scanner;

/**
 * Created by Hp on 6/14/2017.
 */
public class Ques1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = s.nextInt();
        int temp,index;
        int arr[] = new int[size];
        System.out.println("Enter array elements ");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        for(int i =0;i<arr.length-1;i++){
            int min = arr[i];
            index=i;
            for(int j=i+1;j<arr.length;j++){
                 if(arr[j]<min){
                     min=arr[j];
                     index=j;
                 }
            }
            temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
