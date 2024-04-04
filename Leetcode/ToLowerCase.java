//        Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
//
//        Example 1:
//
//        Input: "Hello"
//        Output: "hello"
//        Example 2:
//
//        Input: "here"
//        Output: "here"
//        Example 3:
//
//        Input: "LOVELY"
//        Output: "lovely"

package Leetcode;

public class ToLowerCase {
    public String toLowerCase(String str) {
        String result = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                result += (char)(str.charAt(i) + 32);
            }
            else{
                result += str.charAt(i);
            }
        }
        return result;
    }
}
