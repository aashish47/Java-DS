package Recursion;
import java.util.Scanner;
public class RecursionWords {
    public static String convertNumToString(int num){
        if(num==0){
            return "";
        }
       return convertNumToString(num/10) + getNumToString(num%10);
    }
    public static String getNumToString(int num){
        String arr[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        return arr[num];
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        String str="";
        if(num==0){
            System.out.println("zero");
            System.exit(0);
        }
        str=convertNumToString(num);
        System.out.println(str);
    }
}
