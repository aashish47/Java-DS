package CodingNinjas.Assignment1;

import java.util.Scanner;

/**
 * Created by Hp on 6/15/2017.
 */
public class TrianglePattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num=0;
        for (int i = 1; i <= n; i++) {
            for (int spc = 0; spc < n - i; spc++) {
                System.out.print(" ");
            }
            for (int inc = 1; inc <= i; inc++) {
                System.out.print(++num);
            }
            for(int dec=1;dec<i;dec++){
                System.out.print(--num);
            }
            System.out.print("\n");
        }
    }
}
