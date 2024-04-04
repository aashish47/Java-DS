//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//Example:
//
//        Given nums = [2, 7, 11, 15], target = 9,
//
//        Because nums[0] + nums[1] = 2 + 7 = 9,
//        return [0, 1].

package Leetcode;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        int curr;
        for(int i = 0; i < nums.length; i++){
            curr = nums[i];
            if(map.containsKey(target - curr)){
                ans[0] = map.get(target - curr);
                ans[1] = i;
                return ans;
            }
            else if(!map.containsKey(curr)){
                map.put(curr, i);
            }
        }
        return ans;

    }
}
