package Arrays;
import java.util.*;
public class N3times {
    public static int n3times(final ArrayList<Integer> a){
        if(a.size() == 1){
            return a.get(0);
        }
        int c1 = a.get(0);
        int c2 = a.get(1);
        int c1Count = 0;
        int c2Count = 0;

        for(int num : a){
            if(num == c1){
                c1Count++;
            }
            else if(num == c2){
                c2Count++;
            }
            else if(c1Count == 0){
                c1Count++;
                c1 = num;
            }
            else if(c2Count == 0){
                c2Count++;
                c2 = num;
            }
            else{
                c1Count--;
                c2Count--;
            }
        }
        c1Count = 0;
        c2Count = 0;
        for(int num : a){
            if(num == c1){
                c1Count++;
            }
            else if(num == c2){
                c2Count++;
            }
        }
        if(c1Count > a.size() / 3){
            return c1;
        }
        else if(c2Count > a.size() / 3){
            return c2;
        }
        else{
            return -1;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1000441, 1000441, 1000994 ));
        System.out.println(n3times(a));
    }
}
