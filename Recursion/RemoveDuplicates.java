package Recursion;

/**
 * Created by Hp on 6/26/2017.
 */
public class RemoveDuplicates {
    public static String removeConsecutiveDuplicates(String s) {
        if(s.length()==0){
            return "";
        }
        String ans;
        if(s.length()>1&&s.charAt(0)==s.charAt(1)){
            int i =2;
            while (i<s.length()&&s.charAt(0)==s.charAt(i)){
                i++;
            }
            ans = "" + s.charAt(0) + removeConsecutiveDuplicates(s.substring(i));
        }
        else{
            ans = "" + s.charAt(0) + removeConsecutiveDuplicates(s.substring(1));
        }
        return ans;

    }
    public static void main(String[] args) {
       String ans =removeConsecutiveDuplicates("aabbbbbbcca");
        System.out.println(ans);
    }

}
