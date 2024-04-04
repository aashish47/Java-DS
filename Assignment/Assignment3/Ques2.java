package CodingNinjas.Assignment3;

/**
 * Created by Hp on 6/14/2017.
 */
import java.util.Scanner;
public class Ques2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[]=new int[100];
        System.out.println("Enter array size");
        int size = s.nextInt();
        int product=1;
        System.out.println("Enter array elements");
        for(int i = 0;i<size;i++){
            arr[i]=s.nextInt();
            product *= arr[i];
        }
        System.out.println("product " + product);

    }
}
