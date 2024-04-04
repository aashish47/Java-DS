//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
// An input string is valid if:
//
//        1. Open brackets must be closed by the same type of brackets.
//        2. Open brackets must be closed in the correct order.

// Note that an empty string is also considered valid.
//Example 1:
//
//        Input: "()"
//        Output: true
//        Example 2:
//
//        Input: "()[]{}"
//        Output: true
//        Example 3:
//
//        Input: "(]"
//        Output: false
//        Example 4:
//
//        Input: "([)]"
//        Output: false
//        Example 5:
//
//        Input: "{[]}"
//        Output: true

package Leetcode;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char curr;
        for(int i = 0; i < s.length(); i++){
            curr = s.charAt(i);
            if(curr == '(' || curr == '[' || curr == '{'){
                stack.push(curr);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                if(curr == ')' &&  stack.pop() != '('){
                    return false;
                }
                if(curr == '}' && stack.pop() != '{'){
                    return false;
                }
                if(curr == ']' && stack.pop() != '['){
                    return false;
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
}
