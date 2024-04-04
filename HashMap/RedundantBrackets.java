package DataStructure;

import java.util.Stack;

public class RedundantBrackets {
    public static boolean checkRedundantBrackets(String input) {
        Stack<Character> s1 = new Stack<>();
        for (int i = 0;i<input.length();i++){
            if(input.charAt(i)=='('){
                if(input.charAt(i+1)=='('||input.charAt(i+1)==')'){
                    return  false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkRedundantBrackets("(()(asss(aaa)))"));
    }
}
