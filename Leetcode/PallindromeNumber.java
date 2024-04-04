//        Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
//        Example 1:
//
//        Input: 121
//        Output: true
//        Example 2:
//
//        Input: -121
//        Output: false
//        Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
//        Example 3:
//
//        Input: 10
//        Output: false
//        Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
//        Follow up:
//
//        Coud you solve it without converting the integer to a string?

package Leetcode;

import java.util.ArrayList;

public class PallindromeNumber {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int len = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        while(x > 0){
            arr.add(x % 10);
            x /= 10;
            len++;
        }

        for(int i = 0, j = len - 1; i < j; i++, j--){
            if(arr.get(i) != arr.get(j)){
                return false;
            }
        }
        return true;
    }
}
