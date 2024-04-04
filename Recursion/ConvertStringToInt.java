package Recursion;

/**
 * Created by Hp on 6/26/2017.
 */
public class ConvertStringToInt {
    public static int convertStringToInt(String input){
        if(input.length()==1){
            return input.charAt(0) ;
        }
        int output = (10*(int)input.charAt(0) + (int)convertStringToInt(input.substring(1)));
        return output;
    }
    public static void main(String[] args) {
        int a = convertStringToInt("1234");

    }

}
