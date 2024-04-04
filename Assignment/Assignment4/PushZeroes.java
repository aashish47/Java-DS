package CodingNinjas.Assignment4;

/**
 * Created by Hp on 6/20/2017.
 */
public class PushZeroes {
    public static void main(String[] args) {

int arr[]={3, 0 , 2 , 0 , 1};
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = j; i < arr.length - j-1; i++) {
                if (arr[i] == 0) {
                    arr[i] = arr[i + 1];
                    arr[i + 1] = 0;
                }
            }
        }
        for(int i : arr){
            System.out.println(i);
        }
    }
}