//Given a 32-bit signed integer, reverse digits of an integer.

//Example 1:
//
//        Input: 123
//        Output: 321
//        Example 2:
//
//        Input: -123
//        Output: -321
//        Example 3:
//
//        Input: 120
//        Output: 21
//        Note:
//        Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,          231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

package Leetcode;

public class ReverseInteger {
    public int reverse(int x) {
        int flag = 0;
        if(x < 0){
            flag = 1;
        }
        int X = Math.abs(x);
        long result = 0;
        while(X > 0){
            result = result * 10 + X % 10;
            X /= 10;
        }

        if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
            return 0;
        }
        return flag == 0? (int)result: -(int)result;
    }
}
