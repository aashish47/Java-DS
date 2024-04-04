package Recursion;

/**
 * Created by Hp on 6/24/2017.
 */


public class PermutationPrint {
    public static void print(String input,String resultTillNow){
        if(input.length()==0){
            System.out.println(resultTillNow);
            return;
        }




        for(int i=0;i<input.length();i++) {
            String smallString=input.substring(0,i) + input.substring(i+1);

//            for(int j=0;j<input.length();j++) {
//                if (i != j) {
//                    smallString = smallString + input.charAt(j);
//                }
//            }

            print(smallString, input.charAt(i) + resultTillNow);
        }
    }




    public static void main(String[] args) {

        print("abc","");
    }
}
