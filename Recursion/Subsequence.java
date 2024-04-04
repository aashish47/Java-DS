package Recursion;

/**
 * Created by Hp on 6/26/2017.
 */
public class Subsequence {
    public static String[] subsequence(String input){
        if(input.length()==0){
            String ans[]={""};
            return ans;
        }
        String smallAns[]=subsequence(input.substring(1));
        String ans[]=new String[smallAns.length*2];
        for(int i=0;i<smallAns.length;i++){
            ans[i]=smallAns[i];
        }
        for(int i=0;i<smallAns.length;i++){
            ans[i+smallAns.length]= ""+input.charAt(0)+smallAns[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        String ans[] = subsequence("abc");
        for(String i : ans){
            System.out.println(i);
        }
    }
}
