package Recursion;

import java.util.Scanner;

/**
 * Created by Hp on 6/20/2017.
 */
public class FirstIndexBetter {
    public static int firstIndex(int input[], int x,int index) {

        if(input.length==index){
            return -1;
        }
        if(input[index]==x){
            return index;
        }

        return firstIndex(input,x,index+1);

    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int index=0;
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int ans = firstIndex(arr,x,index);
        System.out.println(ans);

    }
}
