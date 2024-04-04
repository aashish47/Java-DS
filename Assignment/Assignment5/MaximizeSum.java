package CodingNinjas.Assignment5;

/**
 * Created by Hp on 6/22/2017.
 */
public class MaximizeSum {
    public static void main(String[] args) {
        long sum=0;
        long sum1=0;
        long sum2=0;
        //int inter1;
        //int inter2;
        int i ;
        int j;
        int arr1[]={1 , 5 , 10 , 15 , 20 , 25};
        int arr2[]={2 ,4 , 5 , 9 ,15};
        for(i =0,j=0;i<arr1.length&&j<arr2.length;){
            if(arr1[i]==arr2[j]){
               // inter1=i;
                //inter2=j;

//                for(int a = inter1;a>=0&&arr1[a]!=-1;a--){
//                    sum1+=arr1[a];
//                }
//                for(int b = inter2;b>=0&&arr2[b]!=-1;b--){
//                    sum2+=arr2[b];
//                }
//                arr1[inter1]=-1;
//                arr2[inter2]=-1;
                sum1+=arr1[i];
                sum2+=arr2[j];
                if(sum1>sum2){
                    sum+=sum1;
                }
                else{
                    sum+=sum2;
                }
                sum1=0;
                sum2=0;
                i++;
                j++;
                continue;
            }
            if(arr1[i]<arr2[j]){
                sum1+=arr1[i];
                i++;
                continue;
            }
            if(arr2[j]<arr1[i]){
                sum2+=arr2[j];
                j++;
                continue;
            }
        }
//        for(int a = arr1.length-1;a>=0&&arr1[a]!=-1;a--){
//            sum1+=arr1[a];
//        }
//        for(int b = arr2.length-1;b>=0&&arr2[b]!=-1;b--){
//            sum2+=arr2[b];
//        }
//        if(sum1>sum2){
//            sum+=sum1;
//        }
//        else{
//            sum+=sum2;
//        }
        if(i==arr1.length){
            while (j<arr2.length){
                sum2+=arr2[j];
                j++;
            }
        }
        if(j==arr2.length){
            while (i<arr1.length){
                sum1+=arr1[i];
                i++;
            }
        }
        if(sum1>sum2){
            sum+=sum1;
        }
        else{
            sum+=sum2;
        }
        System.out.println(sum);
    }
}
