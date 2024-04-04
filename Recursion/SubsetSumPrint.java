package Recursion;

/**
 * Created by Hp on 6/28/2017.
 */
public class SubsetSumPrint {
    public static void printSubsetsSumTok(int input[], int k) {
        int resultTillNow[]=new int[1];
        resultTillNow[0] = -1;
        subset(input,resultTillNow,0,k);
    }
    public static void subset(int input[],int []resultTillNow,int index,int k) {
        if(index==input.length){
            if(resultTillNow.length>1) {
                int sum=0;
                for (int i = 1; i < resultTillNow.length; i++) {
                    sum+=resultTillNow[i];
                }
                if(sum==k){
                    for (int i =1;i<resultTillNow.length;i++){
                    System.out.print(resultTillNow[i] + " ");

                    }
                    System.out.print("\n");
                }

            }
            return;
        }
        subset(input,resultTillNow,index+1,k);
        int[]arr=new int[resultTillNow.length+1];
        for(int i=0;i<resultTillNow.length;i++){
            arr[i]=resultTillNow[i];
        }
        arr[resultTillNow.length]=input[index];
        subset(input,arr ,index+1,k);

    }

    public static void main(String[] args) {
        int input[]={1,2,3};
        printSubsetsSumTok(input,6);
    }
}
