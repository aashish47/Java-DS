package DataStructure;
import java.util.ArrayList;
import java.util.HashMap;
public class LongestSubsetZero {
    public static int lengthOfLongestSubsetWithZeroSum(ArrayList<Integer> arr)
    {
        HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();

        int sum = 0;
        int max_len = 0;


        for (int i = 0; i < arr.size(); i++)
        {

            sum += arr.get(i);

            if (arr.get(i) == 0 && max_len == 0)
                max_len = 1;

            if (sum == 0)
                max_len = i+1;


            Integer prev_i = hM.get(sum);


            if (prev_i != null)
                max_len = Math.max(max_len, i-prev_i);
            else
                hM.put(sum, i);
        }

        return max_len;
    }

    public static void main(String[] args) {

    }
}
