package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HotelBookings {
    public static boolean hotel(ArrayList<Integer> A, ArrayList<Integer> D, int k){
        Collections.sort(A);
        Collections.sort(D);
        int rooms = 0, i = 0, j = 0;

        while(i < A.size() && j < D.size() && rooms <= k){
            if(A.get(i) < D.get(j)){
                rooms++;
                i++;
            }
            else{
                rooms--;
                j++;
            }
        }
        if(rooms > k){
            return false;
        }
        else{
            return true;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,2,7));
        ArrayList<Integer> D = new ArrayList<>(Arrays.asList(8,6,9));
        System.out.println(hotel(A, D, 2));
    }
}
