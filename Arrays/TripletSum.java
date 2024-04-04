package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class TripletSum {
    public static int solve(ArrayList<String> B) {
        if(B.size() < 3){
            return 0;
        }
        ArrayList<Double> A = new ArrayList<>();
        for(String i : B){
            A.add(Double.valueOf(i));
        }
        Collections.sort(A);

        int l = 0;
        int m = 1;
        int r = A.size() - 1;
        while(r > l && r > m){
            if(A.get(l) + A.get(m) + A.get(r) > 1 && A.get(l) + A.get(m) + A.get(r) < 2){
                return 1;
            }
            else if(A.get(l) + A.get(m) + A.get(r) >=2){
                r--;
            }
            else{
                l++;
                m++;
            }
        }
        return 0;
    }
}
