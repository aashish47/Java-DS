package CodingNinjas.Assignment1;

import java.util.Scanner;

/**
 * Created by Hp on 6/15/2017.
 */
public class StarPattern {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ctr=0;
        for (int i = 1; i <= n; i++) {

            for (int spc = 0; spc < n - i; spc++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i + ctr; j++) {
                System.out.print("*");
            }
            ctr++;
            System.out.print("\n");
        }
    }
}