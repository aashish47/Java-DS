package DataStructure;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class PairWithDifferenceK {
    public static void findPairsDifferenceK(int[] input, int k){
//        HashSet<Integer> set = new HashSet<>();
//        for(int i = 0 ;i<input.length;i++){
//            set.add(input[i]);
//        }
//        for(int j =0;j<input.length;j++){
//            if(set.contains(Math.abs(k-input[j]))){
//                System.out.print(Math.min(input[j],Math.abs(k-input[j])) + "" + Math.max(input[j],Math.abs(k-input[j])));
//                System.out.println();
//            }
//        }
        Arrays.sort(input);
        for(int i = 0;i<input.length;i++){
            for(int j = i+1;j<input.length;j++){

                if(Math.abs(input[i] - input[j]) == k){
                    System.out.println(input[i] + " " + input[j]);

                }
            }
            input[i]=-10000;
        }
    }

    public static void main(String[] args) {
        int[] input = {5,1,2,4};
        findPairsDifferenceK(input,3);
    }
}
