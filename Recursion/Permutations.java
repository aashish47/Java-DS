package Recursion;

public class Permutations {
    public static String[] allPermutations(String input){
        if(input.length()==0){
            String[] result = {""};
            return result;
        }
        String[] smallAns =allPermutations(input.substring(1));
        String[] result = new String[smallAns.length*input.length()];
        char now = input.charAt(0);
        int k=0;
        for(int i = 0;i<smallAns.length;i++){
            String word=smallAns[i];
            for(int j=0;j<=smallAns[0].length();j++){

                result[k++]=word.substring(0,j) + now + word.substring(j);
            }
        }
        return result;
    }
    public static void main(String[] args) {
       String input = "abc";
       String[] result = allPermutations(input);
       for(String i:result){
           System.out.println(i);
       }
    }
}
