package CodingNinjas.Assignment3;

/**
 * Created by Hp on 6/14/2017.
 */
import java.util.Scanner;
public class Ques4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = s.nextInt();
        int sumPositive=0,sumNegative=0;
        int arr[]=new int[size];
        System.out.println("Enter array elements");
        for(int i = 0 ;i<size;i++){
            arr[i]=s.nextInt();
            if(arr[i]<0){
                sumNegative+=arr[i];
            }
            else{
                sumPositive+=arr[i];
            }

        }
        System.out.println("Sum negative " + sumNegative);
        System.out.println("Sum positive " + sumPositive);

    }
}
