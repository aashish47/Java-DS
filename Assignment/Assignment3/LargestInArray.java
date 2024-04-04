package Assignment3; /**
 * Created by Hp on 6/13/2017.
 */
import java.util.Scanner;
public class LargestInArray {
        static  boolean  hasNum=true;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length of the array");
        int length = s.nextInt();
        int arr[] = new int[length];
        arrayFill(arr);
        //int max = arrayLargest(arr);
        //System.out.println("Maximum in array" + " " + max);
        System.out.println("Enter number to be searched");
        int num = s.nextInt();
        int index = search(num, arr);
        if (hasNum) {
            System.out.println("Number found at index position" + " " + index);
        } else {
            System.out.println("Element not found");
        }
    }

    public static void arrayFill(int arr[]){
        Scanner s =new Scanner(System.in);
        System.out.println("Enter elements ");
        for(int i = 0;i<arr.length;i++){

            arr[i] = s.nextInt();
        }
    }
    public static int arrayLargest(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public  static int search(int num,int arr[]) {
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == num) {
                hasNum = true;
                return i;
            }
        }
        return 0;
    }
}
