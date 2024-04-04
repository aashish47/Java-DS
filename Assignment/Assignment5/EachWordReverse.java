package CodingNinjas.Assignment5;

/**
 * Created by Hp on 6/21/2017.
 */
public class EachWordReverse {
    public static void main(String[] args) {


        String output = "";
        String input = "Aashish Agarwal";
        System.out.println(input.length());
        int j=0;
        for (int i = 0; i <input.length(); i++) {
            if (input.charAt(i) == ' '||i==input.length()-1) {
                if(input.charAt(i)==' ') {
                     j = i-1;
                }
                if(i==input.length()-1){
                    j=i;

                }
                while (j != -1&&input.charAt(j) != ' '  ) {
                    output += input.charAt(j--);
                }
                output+=" ";
            }
        }
        for(int  i =0;i<output.length();i++){
            System.out.print(output.charAt(i));
        }
    }
}