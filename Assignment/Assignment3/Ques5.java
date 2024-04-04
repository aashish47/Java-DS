package CodingNinjas.Assignment3;

/**
 * Created by Hp on 6/14/2017.
 */
import  java.util.Scanner;
public class Ques5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = s.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter array elements");
        for(int i = 0 ;i<size;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Enter a number ");
        int num = s.nextInt();
        System.out.println("Pairs are :");
        for(int i=0;i<size-1;i++){
            for( int j =i+1;j<size;j++){
                if((arr[i] + arr[j])==num){
                    System.out.println(arr[i] + " + " + arr[j]);
                }
            }
        }

    }
}
