package Assignment4;
import java.util.Arrays;
/**
 * Created by Hp on 6/19/2017.
 */
public class TripletSum {
    public static void main(String[] args) {
        int arr[]= {};
        int x=1;
        Arrays.sort(arr);
        for(int i =0 ; i<arr.length-2;i++){
            for(int j = i +1 ;j <arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==x)
                        System.out.println(arr[i] + " "+ arr[j] + " "+ arr[k]);
                }
            }
        }
    }
}
