package CodingNinjas.Assignment5;
import java.util.Scanner;

public class Pallindrome {

    public static boolean checkPalindrome(String str){

        int flag=0;
        for(int i =0;i<str.length();i++){
            flag=0;
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                flag=0;
                break;
            }
            else
                flag=1;
        }
        if(flag==1){
            return true;
        }
        else
            return false;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;
        str = s.next();
        boolean check;
        check =checkPalindrome(str);
        System.out.print(check);

    }
}
