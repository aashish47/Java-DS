package Recursion;

/**
 * Created by Hp on 6/26/2017.
 */
public class MergeSort {
    public static void mergeSort(int[] input){
        // Write your code here
        if(input.length<=1){
            return;
        }
        int mid = input.length/2;
        int left[]=new int[mid];
        int right[]=new int[input.length-mid];
        int j =0;
        for(int i=0;i<left.length;i++){
            left[i]=input[i];
        }
        for(;j<right.length;j++){
            right[j]=input[mid+j];
        }
        mergeSort(left);
        mergeSort(right);
        merge(left,right,input);

    }
    public static void merge(int arr1[],int arr2[],int arr3[]){
        int i=0,j=0,k=0;
        for(;i<arr1.length && j<arr2.length;k++){
            if(arr1[i]<arr2[j])
                arr3[k]=arr1[i++];
            else
                arr3[k]=arr2[j++];
        }
        while(i<arr1.length)
            arr3[k++]=arr1[i++];
        while(j<arr2.length)
            arr3[k++]=arr2[j++];
    }
    public static void main(String[] args) {
        int arr[]={2,3,1,5,4};
        mergeSort(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }
}