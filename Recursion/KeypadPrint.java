package Recursion;

/**
 * Created by Hp on 6/25/2017.
 */
public class KeypadPrint {
    public static void printKeypad(int input){
        keypad(input,"");
    }
    public static void keypad(int input,String resultTillNow){
        if(input==0){
            System.out.println(resultTillNow);
            return;
        }
        String key = combination(input%10);
        for(int i=0;i<key.length();i++){
            keypad(input/10,key.charAt(i)+resultTillNow);
        }
    }
    public static String combination(int n){
        String keys[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        return keys[n];
    }
    public static void main(String[] args) {
        printKeypad(23);
    }
}
