package CodingNinjas.Assignment4;

/**
 * Created by Hp on 6/19/2017.
 */
public class InsertionSort {
    public static void main(String[] args) {


        int j, key;
        //write your code here
        int arr[] = {2, 2, 3, 4, 1, 5, 8};

        for (int i = 1; i < arr.length; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0&&arr[j] > key  ) {
                arr[j + 1] = arr[j];
                j--;
            }
            j = j + 1;
            arr[j] = key;
        }
        for( int i : arr){
            System.out.println(i);
        }
    }
}
