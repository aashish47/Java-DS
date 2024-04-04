// Write a function to find the longest common prefix string amongst an array of strings.
//
// If there is no common prefix, return an empty string "".
//
//Example 1:
//
//        Input: ["flower","flow","flight"]
//        Output: "fl"
//        Example 2:
//
//        Input: ["dog","racecar","car"]
//        Output: ""
//        Explanation: There is no common prefix among the input strings.
//        Note:
//
//        All given inputs are in lowercase letters a-z.

package Leetcode;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }

        int len = Integer.MAX_VALUE;
        for(int i = 0; i < strs.length; i++){
            len = Math.min(strs[i].length(), len);
        }
        int j;
        String result = "";
        for(int i = 0; i < len; i++){
            for(j = 0; j < strs.length - 1; j++){
                if(strs[j].charAt(i) != strs[j + 1].charAt(i)){
                    return result;
                }
            }
            result += strs[j].charAt(i);
        }
        return result;
    }
}
