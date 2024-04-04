package CodingNinjas.Assignment2; /**
 * Created by Hp on 6/13/2017.
 */
import java.util.Scanner;
public class Assignment2B_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        int ctr =0;
        int n = s.nextInt();
        for(int i=1;i<=1000;i++){
            num=(3*i)+2;
            if(num%4!=0){
                System.out.print(num + " ");
                ctr++;
            }
            if(ctr==n){
                break;
            }
        }

    }
}
