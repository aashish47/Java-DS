package CodingNinjas.Complexity;

public class QuickSort {
    public static void quickSort(int[]arr,int start,int end){
        if(start>=end){
            return;
        }
        int position = getPosition(arr,start,end);
        quickSort(arr,start,position-1);
        quickSort(arr,position +1,end);
    }
    public static int getPosition(int[]arr,int start,int end) {
//        int ctr=0;
//        int pivot=arr[start];
//        for(int i=start+1;i<=end;i++){
//            if(arr[i]<pivot){
//                ctr++;
//            }
//        }
//        if(ctr==0){
//            return start;
//        }
//        ctr= ctr + start;
//        arr[start]=arr[ctr];
//        arr[ctr]=pivot;
//        int i=start,j=end;
//        while (i<ctr&&j>ctr){
//            if(arr[i]<pivot){
//                i++;
//            }
//            else if(arr[j]>pivot){
//                j--;
//            }
//            else{
//                int temp = arr[j];
//                arr[j]=arr[i];
//                arr[i]=temp;
//                i++;
//                j--;
//            }
//        }
//        return ctr;
//    }
        int pivot =arr[start];
        int i =start+1;
        for(int j =start + 1; j <= end ; j++ )  {
            if ( arr[ j ] < pivot) {
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
        int temp=arr[start];
        arr[start]=arr[i-1];
        arr[i-1]=temp;
        return i-1;
    }
    public static void main(String[] args) {
        int arr[]={2,3,1,4,6,5};
        quickSort(arr,0,arr.length-1);
        for(int i:arr){
            System.out.println(i);
        }
    }
}
