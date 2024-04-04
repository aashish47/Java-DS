package Recursion;



/**
 * Created by Hp on 6/20/2017.
 */
public class ArrayIncreasing {
    public static boolean check(int arr[]){
        if(arr.length==0||arr.length==1){
            return true;
        }
        if(arr[0]>arr[1]){
            return false;
        }
        int small[]=new int[arr.length-1];
        for(int i=0;i<small.length;i++){
            small[i]=arr[i+1];
        }
        return check(small);

    }
    public static void main(String[] args) {


        int array[] = {1 , 5 , 3 ,4 , 5};
        boolean ans = check(array);
        System.out.println(ans);
    }
}