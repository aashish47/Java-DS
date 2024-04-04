package Recursion;

/**
 * Created by Hp on 6/28/2017.
 */
public class CodesReturnPrint {
    public static void printAllPossibleCodes(String input) {
        codes(Integer.parseInt(input),"");
    }
    public static void codes(int number,String resultTillNow){
        if(number==0){
            System.out.print(resultTillNow );
            System.out.println();
            return;
        }
        codes(number/10,(char)(number%10 + 96) + resultTillNow);
        if(number%100>9&&number%100<27){
            codes(number/100,(char)(number%100 + 96) + resultTillNow);
        }
    }
    public static void main(String[] args) {
        printAllPossibleCodes("1123");
    }
}
