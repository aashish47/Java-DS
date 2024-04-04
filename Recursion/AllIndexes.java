package Recursion;

import java.util.Scanner;

/**
 * Created by Hp on 6/23/2017.
 */
public class AllIndexes {
    public static int[] allIndexes(int input[], int x) {
        return allIndex(input,x,input.length-1);

    }
    public static int[] allIndex(int input[],int x,int index){
        if(index==-1){
            int ans[]={};
            return ans;
        }

        int ans[]=allIndex(input,x,index-1);
        if(input[index]==x){
            int ans1[]=new int[ans.length+1];
            int i;
            for( i = 0;i<ans.length;i++){
                ans1[i]=ans[i];
            }
            ans1[ans.length]=index;
            return ans1;
        }
        else{
            return ans;
        }
    }

    public static void main(String[] args) {
        int input[]={1,2,5,5,5};
        Scanner s = new Scanner(System.in);
        int x=s.nextInt();

        int ans[]=allIndexes(input,x);
        for (int i:ans){
            System.out.println(i);
        }
    }

}
