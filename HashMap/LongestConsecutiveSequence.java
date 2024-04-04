package DataStructure;
import java.util.ArrayList;
import java.util.HashMap;

public class LongestConsecutiveSequence {
    public static ArrayList<Integer> longestSubsequence(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i<arr.length;i++){
            map.put(arr[i],i);
        }
        int count = 0;
        int j;
        int start=0;
        for(int i = 0;i<arr.length;i++){
            if(!map.containsKey(arr[i]-1)){
                j = arr[i]+1;
                while(map.containsKey(j)){
                    j++;
                }
                if(count<j-arr[i]){
                    count = j-arr[i];
                    start = arr[i];
                }
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0;i<count;i++){
            ans.add(start++);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1,9,10,11,12,13,14};
        ArrayList<Integer> ans = longestSubsequence(arr);
        for(int i =0 ; i<ans.size();i++){
            System.out.println(ans.get(i));
        }
    }
}
