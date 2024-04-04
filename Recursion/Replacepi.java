package Recursion;

/**
 * Created by Hp on 6/26/2017.
 */
public class Replacepi {
    public static String replace(String input){
        if(input.length()==0){
            return "";
        }
        String output = "";
        String smallAns="";
        if(input.length()>1&&input.substring(0,2).equals("pi")){
            output = smallAns + 3.14 ;
            smallAns = output + replace(input.substring(2));

        }
        else{
            output = ""+input.charAt(0);
            smallAns = output + replace(input.substring(1));
        }

        return smallAns;
    }

    public static void main(String[] args) {
       String ans = replace("pip");

    }
}
