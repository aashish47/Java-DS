package Recursion;

/**
 * Created by Hp on 6/26/2017.
 */
public class Removex {
    public static String removeX(String input){
        if(input.length()==0){
            return "";
        }
        String output;
        if(input.charAt(0)=='x'){
            output  = "" + removeX(input.substring(1));
        }
        else{
            output = ""+input.charAt(0) + removeX(input.substring(1));
        }
        return output;


    }

    public static void main(String[] args) {
        String ans = removeX("abcxabcx");
    }
}
