package Recursion;

/**
 * Created by ankurkumar on 6/20/17.
 */
public class RecursionPractise {

    public static void main(String[] args) {
        int num = 422;
       String[] ans = keyPad(num);

       for(String str: ans) {
           System.out.println(str);
       }
    }




    public static String[] keyPad(int num){


        if(num==0){
            String[] result = {""};
//            String[] result1 = new String[0];
//            result1[0] = "";
            return result;
        }
        String[] smallAns= keyPad(num/10);

        String keys = getNumKeyToString(num%10);
        if(keys.length()==0){
            return smallAns;
        }

        String[] ans = new String[smallAns.length*keys.length()];

        int k =0;
        for(int i =0;i<keys.length();i++){
            for(int j =0;j<smallAns.length;j++){
                ans[k++]= smallAns[j]+keys.charAt(i);
            }
        }

        return ans;
    }




   public static String[]  subSequence(String input){

        if(input.length()==0){
            String[] ans = {""};
            return ans;
        }

       String[] smallAns= subSequence(input.substring(1));
       String[] ans = new String[smallAns.length*2];

       for(int i =0;i<smallAns.length;i++){
           ans[i] = smallAns[i];
       }

       for(int i =0;i<smallAns.length;i++){
           ans[i+smallAns.length] = input.charAt(0)+smallAns[i];
       }
       return ans;

    }

























    public static int  factorial(int num){

       if(num==1){
           return 1;
       }
      return num*factorial(num-1);
    }





//    covertString(int num){
//       if(num==0){
//           return "zero";
//       }
//     return   convertNumToString( num);
//    }
//


    public static String convertNumToString(int num){
       if(num==0){
           return "";
       }

      return convertNumToString(num/10)+ getNumToString(num%10);
    }

    public static String getNumToString(int num){

        String[] arr = {"zero","one","two",};
        return arr[num];
    }

    public static String getNumKeyToString(int num){

        String[] arr = {" ","","ABC","DEF","GHI",};
        return arr[num];
    }































   public static int  fibonacci(int n){
       if(n==0||n==1){
           return n;
       }
        return fibonacci(n-1)+fibonacci(n-2);
    }


    int search7(int[] arr, int index){
        if(arr.length==index){
            return -1;
        }

        if(arr[index]==7){
            return index;
        }

        return search7(arr,index+1);

    }























    int lastIndexOf7(int[] arr, int index){
        if(arr.length==index){
            return -1;
        }

        int ans =  search7(arr,index+1);



        if(ans==-1){
            if(arr[index]==7){
                return index;
            }else{
               return -1;
            }
        }else{
            return ans;
        }
    }




















    int search7(int[] arr){
       if(arr.length==0){
           return -1;
       }

       if(arr[0]==7){
           return 0;
       }
       int[] smallArray = new int[arr.length-1];
       for(int i =0;i<smallArray.length;i++){
           smallArray[i] = arr[i+1];
       }
       int ans = search7(smallArray);

        if(ans==-1){
            return -1;
        }else{
            return ans+1;
        }
    }













    boolean isSorted(int[] arr){
        if(arr.length==0||arr.length==1){
            return true;
        }
        if(arr[0]>arr[1]){
            return false;
        }

        int[] smallArray = new int[arr.length-1];
        for(int i =0;i<smallArray.length;i++){
            smallArray[i] = arr[i+1];
        }
        return isSorted(smallArray);


    }




































}
