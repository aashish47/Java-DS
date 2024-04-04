package CodingNinjas.Assignment5;

/**
 * Created by Hp on 6/20/2017.
 */
import  java.util.Scanner;
public class WaveArray {
    public static void main(String[] args) {
        int i =0;
        Scanner s = new Scanner(System.in);
        int input[][] =new int[3][4];
        for(int k =0;k<input.length;k++){
            for(int j =0;j<input[k].length;j++){
                input[k][j]=s.nextInt();
            }
        }
        for(int j = 0;j<input[0].length;j++){
            if(i==0){
                for(;i<input.length;i++){
                    System.out.print(input[i][j]+" ");
                }
                i=i-1;
            }
            else{
                for(;i>=0;i--){
                    System.out.print(input[i][j]+" ");
                }
                i=0;
            }
        }
    }
}
