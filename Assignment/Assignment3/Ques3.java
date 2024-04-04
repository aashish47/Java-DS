package CodingNinjas.Assignment3;

/**
 * Created by Hp on 6/14/2017.
 */
import java.util.Scanner;
public class Ques3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = s.nextInt();
        int temp;
        int arr[]=new int[size];
        System.out.println("Enter array elements");
        for(int i = 0 ;i<size;i++){
            arr[i]=s.nextInt();
        }
        int j=size;
        for(int i=0;i<(size/2);i++,j--){
            temp=arr[i];
            arr[i]=arr[j-1];
            arr[j-1]=temp;
        }
        System.out.println("Reverse array is ");
        for(int i = 0 ;i<size;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
