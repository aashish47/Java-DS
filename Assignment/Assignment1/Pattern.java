package CodingNinjas.Assignment1;



/**
 * Created by Hp on 6/15/2017.
 */
import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int ctr;
        for(int i = 1 ; i <= n ; i++){
            ctr=i;
            for(int spc=0;spc<n-i;spc++){
                System.out.print(" ");
            }
            for(int j = 1 ; j<=i ; j++){
                System.out.print(ctr++ );
            }
            System.out.print("\n");
        }
    }
}
