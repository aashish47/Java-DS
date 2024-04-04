package Recursion;
import java.util.Scanner;
/**
 * Created by Hp on 6/20/2017.
 */
public class Firstindex {

    public static int firstIndex(int input[], int x) {

        if(input.length==0){
            return -1;
        }
        if(input[0]==x){
            return 0;
        }
        int smallArray[]=new int[input.length-1];
        for(int i =0;i<smallArray.length;i++){
            smallArray[i]=input[i+1];
        }
        int ans=firstIndex(smallArray,x);
        if(ans==-1){
            return -1;
        }
        else{
            return ans+1;
        }
    }

    public static void main(String[] args) {
        int arr[]={};
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int ans = firstIndex(arr,x);

    }
}