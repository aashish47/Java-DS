package CodingNinjas.Complexity;

/**
 * Created by Hp on 6/27/2017.
 */
public class BetterBuuble {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int flag;
        for (int i = 0; i < arr.length - 1; i++) {
            flag=0;
            for (int j = 0 ; j < arr.length - 1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    flag=1;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
            if(flag==0){
                break;
            }
        }
        for(int i:arr){
            System.out.println(i);
        }
    }
}
