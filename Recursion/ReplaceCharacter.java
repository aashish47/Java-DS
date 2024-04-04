package Recursion;

/**
 * Created by Hp on 6/26/2017.
 */
public class ReplaceCharacter {
    public static String replaceCharacter(String input, char c1, char c2) {
        if(input.length()==0){
            return "";
        }
        String ans;
        if(input.charAt(0)==c1){
            ans=""+c2 + replaceCharacter(input.substring(1),c1,c2);
        }
        else{
            ans=""+input.charAt(0) + replaceCharacter(input.substring(1),c1,c2);
        }
        return ans;

    }

    public static void main(String[] args) {
        String ans =replaceCharacter("abcabc",'a','x');
        System.out.println(ans);
    }
}
