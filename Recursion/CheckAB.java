package Recursion;

/**
 * Created by Hp on 6/27/2017.
 */
public class CheckAB {
    public static boolean checkAB(String input) {
        if(input.length()==0){
            return true;
        }
        if(input.charAt(0)=='a'){
            if(input.length()==1){
                return true;
            }
            if(input.length()>2&&input.substring(1,3).equals("bb")){
                return checkAB(input.substring(3));
            }
            if(input.charAt(1)=='a'){
                return checkAB(input.substring(1));
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(checkAB("abb"));
    }
}
