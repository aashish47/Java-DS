package Recursion;

/**
 * Created by Hp on 6/26/2017.
 */
public class SubsequencePrint {
    public static void printSubsequences(String input) {
        subsequence(input,"");
    }
    public static void subsequence(String input,String resultTillNow){
        if(input.length()==0){
            System.out.println(resultTillNow);
            return;
        }
        subsequence(input.substring(1),resultTillNow);
        subsequence(input.substring(1),resultTillNow+input.charAt(0));
    }
    public static void main(String[] args) {
        printSubsequences("abc");
    }
}
