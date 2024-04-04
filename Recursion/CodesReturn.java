package Recursion;

public class CodesReturn {
    public static  String[] getCode(String input) {
        int number = Integer.parseInt(input);
        return codes(number);

    }
    public static String[] codes(int number){
        if(number==0){
            String output[]={""};
            return output;
        }
        String smallAns1[] = codes(number/10);
        if((number%100)>9&&(number%100)<27){
            String smaallAns2[]= codes(number/100);
            String output[]=merge(smallAns1,smaallAns2,number%100);
            return output;
        }
        String output[]=merge(smallAns1,number%10);
        return output;
    }
    public static String[] merge(String []smallAns1,String []smallAns2,int number){
        char current_number=(char)(number+96);
        String output[] = new String[smallAns1.length+smallAns2.length];
        for(int i=0;i<smallAns1.length;i++){
            output[i] = smallAns1[i] +(char)(number%10+96) ;
        }
        for(int i=0;i<smallAns2.length;i++){
            output[i+smallAns1.length] = smallAns2[i] + current_number;
        }
        return output;

    }
    public static String[] merge(String[]smallAns1,int number ){
        char current_number=(char)(number+96);
        String output[] = new String[smallAns1.length];
        for(int i=0;i<smallAns1.length;i++){
            output[i] = smallAns1[i] + current_number;
        }
        return output;
    }

    public static void main(String[] args) {
        String[] ans =getCode("123");
        for (String i : ans){
            System.out.println(i);
        }
    }
}
